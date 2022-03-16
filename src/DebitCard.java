public class DebitCard {
    private double cardID;
    private int MaxBalance;
    private int currentbalance;
    private boolean cardIsActive= true;

    private boolean deactivate= false;

    public DebitCard(double cardID, int MaxBalance){
        this.cardID= cardID;
        this.MaxBalance= MaxBalance;

    }

    public int showCurrentBalance(){

        this.currentbalance= currentbalance;
        return currentbalance;
    }

    public boolean disableCard(){
        int k = showCurrentBalance();
        if(MaxBalance<= k){
            deactivate= true;

        }
        return deactivate;
    }

    public boolean isCardIsActive(){
        if(deactivate== false){
            cardIsActive = true;
        }
        return cardIsActive;
    }
}
