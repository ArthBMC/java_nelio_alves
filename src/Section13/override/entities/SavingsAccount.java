package Section13.override.entities;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount){
        balance-= amount;
    }

    public void updateBalance(double interestRate){
        balance += balance*interestRate;
    }


    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
