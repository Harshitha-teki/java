class SharedBuffer {
    private final int[] buffer;
    private int count, in, out;
    private final int size;

    public SharedBuffer(int size) {
        this.size = size;
        buffer = new int[size];
        count = in = out = 0;
    }

    // Produce an item
    public synchronized void produce(int item) throws InterruptedException {
        while (count == size) {
            wait();  // Wait if buffer is full
        }
        buffer[in] = item;
        in = (in + 1) % size;  // Circular buffer
        count++;
        System.out.println("Produced: " + item);
        notifyAll();  // Notify waiting consumer(s)
    }

    // Consume an item
    public synchronized int consume() throws InterruptedException {
        while (count == 0) {
            wait();  // Wait if buffer is empty
        }
        int item = buffer[out];
        out = (out + 1) % size;  // Circular buffer
        count--;
        System.out.println("Consumed: " + item);
        notifyAll();  // Notify waiting producer(s)
        return item;
    }
}

class Producer implements Runnable {
    private final SharedBuffer buffer;
    private final int maxItems;

    public Producer(SharedBuffer buffer, int maxItems) {
        this.buffer = buffer;
        this.maxItems = maxItems;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < maxItems; i++) {
                buffer.produce(i);
                Thread.sleep(100); // Simulate time taken to produce an item
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
    private final SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                buffer.consume();
                Thread.sleep(150); // Simulate time taken to consume an item
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class ProducerConsumerEx {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(5);

        // Create producer and consumer threads
        Producer producer = new Producer(buffer, 10);  // Produce 10 items
        Consumer consumer = new Consumer(buffer);

        // Create Thread instances
        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        // Start the threads
        producerThread.start();
        consumerThread.start();

        try {
            // Wait for producer to finish
            producerThread.join();
            // Interrupt the consumer thread after producer finishes
            consumerThread.interrupt(); 
            consumerThread.join();  // Wait for consumer to finish
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Production and Consumption completed.");
    }
}


