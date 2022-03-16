public class Student {

    static String PrincipalName = "Gauvara";


    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public double GPA;

    static int principalage= 55;




    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    private int studentID;


    private String StudentName;

    public Student(int a, String b){

        this.studentID = a;
        this.StudentName = b;


    }

    static String ChangePrincipalName(){

        PrincipalName = "BAsam";

        return PrincipalName;


    }




}
