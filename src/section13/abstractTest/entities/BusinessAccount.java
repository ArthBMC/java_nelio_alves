package section13.abstractTest.entities;

public class BusinessAccount  extends Account {
    private double loanLimit;

    public BusinessAccount(){
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    @Override
    public void withdraw (double amount){
        super.withdraw(amount);
        balance -= 2.0;
    }




    public void loan (double amount){
        if (amount <= loanLimit) {
            deposit(amount);
        }
    }


    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }
}
