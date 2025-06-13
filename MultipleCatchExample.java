import java.util.Scanner;
public class MultipleCatchExample {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);      
            int[] numbers = new int[5];
            System.out.println("Accessing the 10th element: " + numbers[9]); 
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
            scanner.close();
        }}} 
