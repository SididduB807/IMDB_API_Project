public class Deck {

    private int[] deck;

    public static final int NUMCARDS = 52;

    public Deck(){

        this.deck = new int[NUMCARDS];

        for(int i=0;i<deck.length;i++){

            deck[i]=i;

        }
    }

    public void writeDeck(){

        for(int card: deck){
            System.out.println(card + " ");
            System.out.println();
            System.out.println();
        }

    }

    public void swap(int[] arr, int i, int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }

    public void shuffle()
    {
        int index =0;

        for (int i= NUMCARDS-1; i>0; i--){

            index = (int)(Math.random()*(i+1));

            swap(deck,i,index);
        }
    }
}
