import java.util.Scanner;
class Qua
{
 public static void main(String[] args)
{

	Scanner sc=new Scanner(System.in);
	System.out.println("enter a value:");
	double a= sc.nextDouble();
	System.out.println("enter b value:");
	double b= sc.nextDouble();	
	System.out.println("enter c value:");
	double c= sc.nextDouble();
	double d= b* b -4*a*c;	
	double r1,r2,real,imaginary;
	if(d>0)
	{
		r1=( -b + Math.sqrt(d)/(2*a));
		r2= (-b - Math.sqrt(d)/(2*a));
		System.out.println("r1 is "+r1 + "r2 is " +r2);

	}
	else if(d==0)
	{
		r1= -b /(2*a);
		System.out.println("r1 is "+r1 );
	}
	else
	{
		real=-b/ (2*a);
		imaginary=Math.sqrt(d)/(2*a);
		System.out.println("r1=" + real + "+i" +imaginary);
		System.out.println("r2=" + real + "-i" +imaginary);
	}
}
}