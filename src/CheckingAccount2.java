public class CheckingAccount2 extends Account2 {

    private int checkingacctbalance;

    public CheckingAccount2(String CustomerName, int CustomerID, int checkingacctbalance){
        super(CustomerName,CustomerID);
        this.checkingacctbalance= checkingacctbalance;
    }
    public void showCustomerAddress(){
        super.showCustAddress();
    }
    public int showCurrentAcctBalance(){
        return checkingacctbalance;
    }
}
