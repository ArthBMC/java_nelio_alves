package section13.abstractTest.entities;

public abstract class Account {
    protected String holder;
    protected Integer number;
    protected Double balance;

    public Account(){

    }
    public Account(Integer number,String holder, Double balance) {
        this.holder = holder;
        this.number = number;
        this.balance = balance;
    }


    public void withdraw (double amount){
        balance -= amount+5.0;
    }

    public void deposit (double amount){
        balance += amount;
    }


    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

}
