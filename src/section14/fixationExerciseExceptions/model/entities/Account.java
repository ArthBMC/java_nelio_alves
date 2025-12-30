package section14.fixationExerciseExceptions.model.entities;

import section14.fixationExerciseExceptions.model.exceptions.DomainException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account (){}

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit (Double amount){
        balance += amount;
    }

    public void withdraw (Double amount) throws DomainException {
        if (balance >= amount && amount <= withdrawLimit){
            balance -= amount;
            System.out.printf("New Balance: $%.2f%n", balance);
        } else if (amount > withdrawLimit){
            throw new DomainException("The amount exceeds withdraw limit.");
        } else {
            throw new DomainException("Insufficient balance");
        }

    }


    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

}

