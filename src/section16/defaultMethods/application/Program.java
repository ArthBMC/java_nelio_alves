package section16.defaultMethods.application;

import section16.defaultMethods.services.BrazilInterestService;
import section16.defaultMethods.services.Payment;
import section16.defaultMethods.services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);


        System.out.print("Amount: ");
        double amount = in.nextDouble();
        System.out.print("Months: ");
        int months = in.nextInt();

        Payment br = new BrazilInterestService(2.0);
        double paymentBr = br.payment(amount, months);
        Payment usa = new UsaInterestService(1.0);
        double paymentUs = usa.payment(amount, months);

        System.out.println("Payment after "+ months + " months: ");
        System.out.printf(String.format("%.2f\n", paymentBr));
        System.out.printf(String.format("%.2f", paymentUs));


        in.close();
    }
}
