abstract class Shape 
{
	abstract double calculateArea();
}
class Circle extends Shape 
{
	private double radius;
	public Circle(double radius) 
	{
		this.radius = radius;
	}
	// Override
	double calculateArea() 
	{
		return Math.PI * radius * radius;
	}
}
class Rectangle extends Shape 
{
	private double length;
	private double width;
	public Rectangle(double length, double width) 
	{
		this.length = length;
		this.width = width;
	}
	//Override
	double calculateArea() 
	{
		return length * width;
	}
}
class Triangle extends Shape 
{
	private double base;
	private double height;
	public Triangle(double base, double height) 
	{
		this.base = base;
		this.height = height;
	}
	//Override
	double calculateArea() 
	{
		return 0.5 * base * height;
	}
}
class ShapeAreaCalculator 
{
	public static void main(String[] args) 
	{
		Shape circle = new Circle(2);
		Shape rectangle = new Rectangle(4,7);
		Shape triangle = new Triangle(6,5);
		System.out.println("Circle Area: " +circle.calculateArea());
		System.out.println("Rectangle Area: " +rectangle.calculateArea());
		System.out.println("Triangle Area: " +triangle.calculateArea());
	}		
}