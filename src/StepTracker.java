public class StepTracker {

    private int numberOfSteps;
    private int numofactivedays;

    public  StepTracker(int numberOfSteps){
        this.numberOfSteps= numberOfSteps;
    }
    public void addDailySteps(int numberOfSteps){

        this.numberOfSteps= numberOfSteps;
    }
    public int activeDays(){
        return this.numofactivedays;
    }
    public double averageSteps(int numberOfSteps){
        int k = activeDays();
        double avg= (double) numberOfSteps/k;
        return avg;
    }
}
