package section8.estaticos.comPoo.application;

import section8.estaticos.comPoo.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        Calculator calc = new Calculator();

        System.out.print("Enter Radius: ");
        double radius = in.nextDouble();

        double c = calc.circumference(radius);

        double v = calc.volume(radius);

        System.out.printf("Circumfertence: %.2f\n", c);
        System.out.printf("Volume: %.2f\n", v);
        System.out.printf("PI Value: %.2f\n", calc.PI);


        in.close();
    }
}

