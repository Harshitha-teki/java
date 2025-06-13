class TeacherInfo
{
    String Name;
    String Sub;
    int Id;
    TeacherInfo()                      //default constructor
    {
        System.out.println("DEFAULT CONSTRUCTOR");
    }
    TeacherInfo(String Name)
    {
	this();                         //calling default constructor
        this.Name = Name;
	getInfo();
    }
    TeacherInfo(String Name,String Sub)
    {
	this(Name);
        this.Name = Name;
        this.Sub = Sub;
	getInfo();
    }
    TeacherInfo(String Name,String Sub,int Id)
    {
	this(Name,Sub);
        this.Name = Name;
        this.Sub = Sub;
	this.Id=Id;
    }
    void getInfo()
    {
	System.out.println("Name:" +Name + " Subject:" +Sub + " Id:" +Id) ;
    }   
}

public class Teacherdemo
{
    public static void main(String[]args)
    {
    	TeacherInfo ti = new TeacherInfo("Harshitha","Java",6159);
     	ti.getInfo();
    }
}