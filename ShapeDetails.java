class Shape
{
	String shapename;
	Shape(String shapename)
	{
		this.shapename = shapename;
	}
	String displayshape()
	{
		return "shapename:" +shapename ;
	}
	
}
class Square extends Shape
{
	double length;
	double breadth;
	Square(String shapename,double length,double breadth)
	{
		super(shapename);
		this.length=length;
		this.breadth=breadth;
	}	
	double DispArea()
	{
		return length * breadth ;
	}


}
class ShapeDetails
{
	public static void main(String[] args)
	{
		Square s =new Square("Square",10.8,20.7);
		System.out.println(s.displayshape());
		System.out.println(s.DispArea());
	}


}