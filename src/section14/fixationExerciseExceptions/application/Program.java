package section14.fixationExerciseExceptions.application;

import section14.fixationExerciseExceptions.model.entities.Account;
import section14.fixationExerciseExceptions.model.exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        try {
            System.out.println("Enter account date: ");
            System.out.print("Number: ");
            int number = in.nextInt();
            in.nextLine();
            System.out.print("Holder: ");
            String holder = in.nextLine();
            System.out.print("Initial balance: ");
            double inBalance = in.nextDouble();
            System.out.print("Withdraw Limit: ");
            double withdrawLimit = in.nextDouble();
            Account acc1 = new Account(number, holder, inBalance, withdrawLimit);

            System.out.print("\nEnter amount for withdraw: ");
            double amount = in.nextDouble();
            acc1.withdraw(amount);
        }
        catch (DomainException e){
            System.out.println("Withdraw error: "+ e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected error");
        }

        in.close();
    }
}
