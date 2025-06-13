import java.util.Scanner;
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int numerator, denominator, result;
        try {
            	System.out.print("Enter numerator: ");
            	numerator = scanner.nextInt();
            	System.out.print("Enter denominator: ");
            	denominator = scanner.nextInt();
            	result = numerator / denominator;
            	System.out.println("Result: " + result);
        } 
	catch (ArithmeticException e) {
            	System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            	System.out.println("Error: " + e.getMessage());
        } finally {
            	System.out.println("Execution completed.");
            	scanner.close();
        }
    }
}
