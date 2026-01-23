package section17.introducingGenerics.application;

import section17.introducingGenerics.services.PrintService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in).useLocale(Locale.US);

        PrintService<Integer> list = new PrintService<>();

        System.out.print("How many values: ");
         int n = in.nextInt();

         for (int i = 0; i < n; i++){
             int value = in.nextInt();
             list.addValue(value);
         }

        list.print();
        System.out.println("First element: " + list.first());
    }
}
