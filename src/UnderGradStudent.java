public class UnderGradStudent extends Student2 {

    public int getTotalsubject() {
        return totalsubject;
    }

    public void setTotalsubject(int totalsubject) {
        this.totalsubject = totalsubject;
    }

    private int totalsubject ;


    public UnderGradStudent(){
        super();
    }

    public UnderGradStudent(String studName, String studGrade){
        super(studName,studGrade);


    }

    public UnderGradStudent(String StudName, String Grade, int Id){
        super(StudName, Grade, Id);

    }

    public void computeGrade(){

        super.computeGrade("hello");
        this.setGrade("Fail");


    }

    public static void PrintStudentobject(){
        System.out.println("hello world");
    }

    private void dosomething(){

    }


}
