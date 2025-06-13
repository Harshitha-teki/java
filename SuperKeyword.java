class Parent 
{
  	  int id;
    	  String name;
  	  Parent(int id, String name) 
{
      		  this.id = id;
        		  this.name = name;
    	 }
}
class Child extends Parent 
{
    	String city;
    	Child(int id, String name, String city) 
{
        		super(id, name);
        		this.city = city;
    	}
    	void display() {
       		 System.out.println("Id:" +id+ "  Name :"+name+"  City :"+city);
   	 }
}

public class SuperKeyword
{
    public static void main(String[] args) {
        Child obj1 = new Child(100, "Harshitha", "Surampalem");
        obj1.display();
    }
}
