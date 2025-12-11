package section13.override.application;

import section13.override.entities.Account;
import section13.override.entities.BusinessAccount;
import section13.override.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 1000.0);
        acc.withdraw(200.0); //com taxa do metodo generico
        System.out.println(acc.getBalance());

        SavingsAccount acc2 = new SavingsAccount(1002, "Pedro", 1000.0, 2.0);
        acc2.withdraw(200.0); //sem taxa do metodo especifico
        System.out.println(acc2.getBalance());


        BusinessAccount acc3 = new BusinessAccount(1003, "Jorge", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());


    }
}
