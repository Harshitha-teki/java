class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
class Person {
    private int age;
    public void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            	throw new InvalidAgeException("Invalid age: " + age + ". Age must be between 0 and 150.");
        }
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
public class UserDefinedExceptionExample {
    public static void main(String[] args) {
        Person person= new Person();
        try {
            person.setAge(25);
            System.out.println("Age set to: " + person.getAge());

            person.setAge(-5); // This will throw an InvalidAgeException
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            person.setAge(200); // This will also throw an InvalidAgeException
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


