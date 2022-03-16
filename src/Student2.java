public class Student2 {

    public static  void PrintStudentobject(){

        System.out.println("i am in the Print static method");
    }
    private int id;

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

    private String name;
    private String grade;

    public void Justcheck(){




    }

    //Default constuctor in super class
    public Student2(){
        this.name = "";
        this.grade= "";
    }

    //another constuctor with params
    public Student2(String studName, String studGrade){
        this.name= studName;
        this.grade= studGrade;

    }

    //one more construcmtor with didffer params
    public Student2(String Name, String Grade, int Id){

        this.id = Id;
        this.name = Name;
        this.grade = Grade;


    }


    public void computeGrade(){
        System.out.println("jh");
        this.grade= "pass";
       // System.out.println(jj);
    }

    public void computeGrade(String aa){

        System.out.println("overloaded compute grade");
    }

    private void dosomething(){
        System.out.println("hh");

    }

}
