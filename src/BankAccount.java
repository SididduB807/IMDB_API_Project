public class BankAccount {

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private double balance;

    public BankAccount() {
       // balance =0;
    }

    public BankAccount(double acctBalance){

        balance = acctBalance;

    }

    public void deposit (double amount){

        balance = balance + amount;
    }


    public void withdraw(double amount) {

        balance = balance - amount;
    }

    public void withdraw(double amount,int fff) {

        balance = balance - amount;
    }


    public double getBalance() {

        return balance;
    }


}
