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
	String DispArea()
	{
		return "Square Area:" + length * breadth ;
	}
}
class Cube extends Square
{
	double height;
	Cube (String shapename,double length,double breadth,double height)
	{
		super(shapename,length,breadth);
		this.height= height;
	}
	String DisplayArea()
	{
		return "Cube area: "+ length * breadth * height ;
	}		
}
class ShapeDetailsMI
{
	public static void main(String[] args)
	{
		Cube c=new Cube("Cube",10.8,20.7,15.3);
		System.out.println(c.displayshape());
		System.out.println(c.DispArea());
		System.out.println(c.DisplayArea());
	}
}