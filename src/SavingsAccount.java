public class SavingsAccount extends BankAccount{

    private double interestRate;

    public SavingsAccount() {

        //super();
        //interestRate =0;

        //or
       super();
      interestRate = 0;

    }

    public SavingsAccount(double acctbalance, int rate){

        //super(acctbalance);
        super(acctbalance);
        interestRate = rate;

       // super(acctbalance);
       // this.setBalance(acctbalance);
        //this.interestRate = rate;
        //this.interestRate = rate;


        //correct choic
        //super(acctbalance);
        //interestRate = rate;

       // super();

    }

    public void addInterest() {

    }
}
