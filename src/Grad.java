public class Grad extends Student1 {

    //default constructor
    public Grad() {

        super();
    }

    //constructor
    public Grad(String StudName, int[] StudentTests, String StudentGrade){
        //no need to initialize instance variables. just call super
        super(StudName, StudentTests, StudentGrade);
    }

    public void ComputeGrade()
    {
        super.ComputeGrade();

        System.out.println("This is in the computegrade method of the subclass Grad");

    }
}
