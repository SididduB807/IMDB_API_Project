public class intPair {
    public int getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(int firstValue) {
        this.firstValue = firstValue;
    }

    public int getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(int secondValue) {
        this.secondValue = secondValue;
    }

    private int firstValue;
    private int secondValue;

    public intPair(int first, int second){
        firstValue = first;
        secondValue = second;
    }
}
