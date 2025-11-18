package section9.exercicioFixacao.util;

public class Account {
    private String holder;
    private final int accountNumber;
    private double balance;

    public Account(String holder, int accountNumber, double initialDeposit) {
        this.holder = holder;
        this.accountNumber = accountNumber;
        deposit(initialDeposit);
    }

    public Account(String holder, int accountNumber) {
        this.holder = holder;
        this.accountNumber = accountNumber;
    }

    public String getHolder(){
        return holder;
    }

    public void setHolder(String holder){
        this.holder = holder;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit (double deposit){
        balance += deposit;
    }

    public void withdraw (double withdraw){
         balance -= (withdraw+5);
    }

    @Override
    public String toString(){
        return "Account "
                +accountNumber
                +", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }

}