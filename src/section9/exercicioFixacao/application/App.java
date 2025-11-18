package section9.exercicioFixacao.application;

import section9.exercicioFixacao.util.Account;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);
        Account account;

        System.out.print("Enter account number: ");
        int accountNumber = in.nextInt();
        System.out.print("Enter account holder: ");
        in.nextLine();
        String holder = in.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char answer1 = in.next().charAt(0);
        if (answer1 == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = in.nextDouble();
            account = new Account(holder, accountNumber, initialDeposit);
        } else {
            account = new Account(holder, accountNumber);
        }

        System.out.println("\nAccount data: \n" + account);

        System.out.print("\nEnter a deposit value: ");
        account.deposit(in.nextDouble());
        System.out.println("Updated account data: " + account);
        System.out.print("\nEnter a withdraw value: ");
        account.withdraw(in.nextDouble());
        System.out.print("Updated account data: " + account);

        in.close();

    }
}
