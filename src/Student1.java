public class Student1 {

    private String name;
    private int[] tests;
    private String grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public  Student1() {
        System.out.println("This is the default constructor of Superclass Student1");

    }
    public Student1(String StudentName, int[] StudentTests, String StudentGrade){

        this.name = StudentName;
        this.grade = StudentGrade;
        this.tests = StudentTests;

    }

    public void ComputeGrade(){

        System.out.println("Superclass ComputeGrade");
    }


}
