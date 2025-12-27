package section13.abstractTest.application;


import section13.abstractTest.entities.Account;
import section13.abstractTest.entities.BusinessAccount;
import section13.abstractTest.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Pedro", 1000.0, 0.01 ));
        list.add(new BusinessAccount(1002, "Maria", 1000.0, 500.0 ));
        list.add(new BusinessAccount(1003, "Jorge", 100.0, 600.0 ));
        list.add(new SavingsAccount(1004, "Julio", 5000.0, 0.01 ));

        Double sum = 0.0;
        for (Account a: list){
            sum += a.getBalance();
        }

        System.out.printf("Total Balance: %.2f%n", sum);


        for (Account acc: list){
            acc.deposit(10.0);
        }

        for (Account acc: list){
            System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }

    }
}
