public class Ticket {
    public String getRow() {
        return row;
    }

    public int getSeat() {
        return seat;
    }

    public double getPrice() {
        return price;
    }

    private String row;
    private int seat;
    private double price;

    public Ticket(String aRow, int aSeat, double aPrice){
        row = aRow;
        seat = aSeat;
        price= aPrice;
    }
}
