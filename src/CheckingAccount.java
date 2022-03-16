public class CheckingAccount  extends BankAccount{

    private static final double FEE = 2.0;
    private static final double MIN_BALANCE = 50.0;

    public CheckingAccount(double acctBalance) {

       deposit(acctBalance);
    }

    public void withdraw(double amount){

        super.withdraw(amount,1);
        if(getBalance() < MIN_BALANCE)
            super.withdraw(FEE);

    }
}
