public class SavingsAccount2 extends Account2 {


    private int SavingsAcctMaxBal;

    public SavingsAccount2(String CustomerName, int CustomerID, int SavingsAcctMaxBal){

        super(CustomerName,CustomerID);
        this.SavingsAcctMaxBal = SavingsAcctMaxBal;

    }
    public void ShowCustomerAddress(){
        super.showCustAddress();


    }
    public int showCurrentAcctBalance(){
        return SavingsAcctMaxBal;
    }
}
