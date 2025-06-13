interface Shape 
{
    void draw();
    double getArea();
}
class Circle implements Shape 
{
    private double radius;
    public Circle(double radius) 
    {
        this.radius = radius;
    }
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
public class InterfaceExample
{
    public static void main(String[] args)
    {
	Circle circle = new Circle(5.0);
	circle.draw();
	System.out.println("Area: " +circle.getArea());
    }
}

