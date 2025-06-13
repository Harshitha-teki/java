class Thread1 extends Thread 
{
	synchronized public void run()
	{
		System.out.println("Good Morning");
		
		try {
			sleep(1000);
		} catch(Exception e) { }
	}
}
class Thread2 extends Thread 
{
	public void run()
	{
		System.out.println("Hello");
		try {
			sleep(2000);
		} catch(Exception e) { }
	}
}
class Thread3 extends Thread
{
	public void run()
	{
		System.out.println("Welcome");
		try {
			sleep(3000);
		} catch(Exception e) { }
	}
}
class ThreadDemo
{
	public static void main(String[] args)
	{
		Thread1 t1=new Thread1();
		t1.start();
		Thread2 t2=new Thread2();
		t2.start();
		Thread3 t3=new Thread3();
		t3.start();
	}
}