public class APExamSamplePrivateStudent {

    //Sample to show the "Private modifier"
    //Instance variable studentId.
    //studentId
    private int studentId;

    //Static variables are class variables. Not instance variables. Instance variables will have values only when an instance of the
    //class is created.
    //To access static variables, no need to create the instance of the class. You can access them directly from the class
    static String Principal = "Basam Nath";

    //Getter and setter for modifying the private variable studentId and First Name
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }



    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void IncrementAge(){

        this.age = this.age + 1;
    }



    //Another construtor
    public  APExamSamplePrivateStudent(int Id, String FName, int StudentAge){

        this.studentId = Id;
        this.firstName = FName;
        this.age = StudentAge;
    }

















}
