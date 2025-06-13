class StudentInfo {
    String sname;
    String sbranch;
    String ssec;
    String sid;

    public StudentInfo(String sname, String sbranch, String ssec, String sid) {
        this.sname = sname;
        this.sbranch = sbranch;
        this.ssec = ssec;
        this.sid = sid;
    }
    public StudentInfo(String sname, String sbranch) {
        this.sname = sname;
        this.sbranch = sbranch;
        this.ssec = ssec;
        this.sid = sid;
    }
    public StudentInfo(String sname, String sbranch, String ssec) {
        this.sname = sname;
        this.sbranch = sbranch;
        this.ssec = ssec;
        this.sid = sid;
    }
    String displayInfo() {
        return "student name : " + sname + " \nstudent branch : " + sbranch + " \nstudent section : " + ssec + " \nstudent ID : " + sid;

    }
    
}
public class OverloadingDemo {
    public static void main(String[] args) {
        StudentInfo Student1 = new StudentInfo("Lalitha", "AIML", "b", "23A91A6159");
        StudentInfo Student2 = new StudentInfo("Hema", "AIML", "b" );
        StudentInfo Student3 = new StudentInfo("mounika", "AIML");

        System.out.println("\nStudent 1 Information:");
        System.out.println(Student1.displayInfo()); 

        System.out.println("\nStudent 2 Information:");
        System.out.println(Student2.displayInfo());

        System.out.println("\nStudent 3 Information:");
        System.out.println(Student3.displayInfo());
        
     }
}


