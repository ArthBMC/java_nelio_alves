package section8.exercicioFixaxao.app;

import section8.exercicioFixaxao.util.CurrencyConverter;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        System.out.print("What is the dollar price? ");
        double dol = in.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double quantDol = in.nextDouble();

        double conversion = CurrencyConverter.convertDol(dol, quantDol);

        System.out.printf("Amount to paid in reais = %.2f", conversion);


    }
}
