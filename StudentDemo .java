class StudentInfo {
    String sname;
    String sbranch;
    String sid;

    StudentInfo(String sname, String sbranch,String sid) {
        this.sname = sname;
        this.sbranch = sbranch;
        this.sid = sid;
    }
    StudentInfo(String sname, String sbranch) {
        this.sname = sname;
        this.sbranch = sbranch;
        this.sid = sid;
    }
    StudentInfo(String sname) {
        this.sname = sname;
        this.sbranch = sbranch;
        this.sid  =sid;
    }
    String displayInfo() {
        return "student name : " + sname + " student branch : " + sbranch + " student ID : " + sid;

    }
    
}
public class StudentDemo 
{
    public static void main(String[] args) 
    {
        StudentInfo Student1 = new StudentInfo("Harshitha", "AIML","23A91A6159");
        StudentInfo Student2 = new StudentInfo("keerthi", "AIML");
        StudentInfo Student3 = new StudentInfo("pinky”);

        System.out.println("\nStudent 1 Information:");
        System.out.println(Student1.displayInfo()); 

        System.out.println("\nStudent 2 Information:");
        System.out.println(Student2.displayInfo());

        System.out.println("\nStudent 3 Information:");
        System.out.println(Student3.displayInfo());
        
     }
}
