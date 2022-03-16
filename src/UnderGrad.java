public class UnderGrad extends Student1 {

    //default constructor of Undergrad is same as the default constructor of the superclass
    public UnderGrad(){
        super();

    }

    public UnderGrad(String StudName, int[] StudentTests, String StudentGrade){
        //no need to initialize instance variables. just call super
        super(StudName, StudentTests, StudentGrade);
    }

    public void ComputeGrade(){
        System.out.println("This is ComputeGrade in Undergrad subclass");
    }


}
