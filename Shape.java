class Shape
{
	String shapetype;
	Shape(String shapetype)
	{
		this.shapetype = shapetype;
	}
	String dispShape()
	{
		return shapetype;
	}
}
class Rectangle extends Shape
{
	double length;
	double breadth;
	Rectangle(String shapetype, double length, double breadth)
	{
		super(shapetype);
		this.length = length;this.breadth = breadth;
	}
	double area()
	{
	return length*breadth;
	}
}
class ShapeInfo
{
	public static void main(String[] args)
	{
		Rectangle R = new Rectangle("Rectangle",18.3,16.2);
		System.out.println(R.dispShape());
		System.out.println(R.area());
	}
}