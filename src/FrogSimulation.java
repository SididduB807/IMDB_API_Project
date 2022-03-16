public class FrogSimulation{
    private int goalDistance;

    private int maxHops;

    public FrogSimulation(int dist, int numHops){

        this.goalDistance= dist;
        this.maxHops = numHops;


    }
    private int hopDistance(){
        int i = 1;
        return i;


    }
    public boolean Simulate(){
        int hoppeddistance = 0;

        for(int z = 0; z< maxHops; z++){

            hoppeddistance = hoppeddistance + hopDistance();
        }
        if(hoppeddistance > goalDistance){
            return true;
        }
        else{
            return false;
        }

    }
    public double runSimulations(int num){
        int SimulationTrueCounter = 0;

        for(int i = 0; i< num; i++){
            boolean k = Simulate();
            if(k== true){
                SimulationTrueCounter++;

            }

        }
        return SimulationTrueCounter/num;
    }

}
