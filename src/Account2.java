public class Account2 {

    private String CustomerName;
    private int CustomerID;
    private String CustomerAddress;

    public Account2(){

    }
    public Account2(String CustomerName, int CustomerID){
        this.CustomerName= CustomerName;
        this.CustomerID= CustomerID;

    }
    public void showCustAddress(){
        System.out.println(this.CustomerAddress);
    }
}
