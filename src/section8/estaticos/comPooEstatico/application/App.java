package section8.estaticos.comPooEstatico.application;

import section8.estaticos.comPooEstatico.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter Radius: ");
        double radius = in.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("Circumfertence: %.2f\n", c);
        System.out.printf("Volume: %.2f\n", v);
        System.out.printf("PI Value: %.2f\n", Calculator.PI);


        in.close();
    }
}

