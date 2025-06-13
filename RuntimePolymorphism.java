class Vehicle 
{
    void start() 
    {
        System.out.println("Vehicle is starting");
    }
}
class Car extends Vehicle 
{
    void start() 
    {
        System.out.println("Car is starting");
    }
}
class Bike extends Vehicle
{
    void start() 
    {
        System.out.println("Bike is starting");
    }
}
public class RuntimePolymorphism 
{
    public static void main(String[] args) 
    {
        Vehicle v=new Vehicle();
	v.start();
        v = new Car();
        v.start(); 
        v = new Bike();
        v.start(); 
    }
}