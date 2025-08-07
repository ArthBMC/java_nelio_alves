package section8.exerciciosFIxacao.exercicio1.application;

import section8.exerciciosFIxacao.exercicio1.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class rectangleCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);
        Rectangle form1 = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        form1.width = in.nextDouble();
        form1.height = in.nextDouble();

        System.out.printf("AREA = %.2f \n",form1.area());
        System.out.printf("PERIMETER = %.2f \n",form1.perimeter());
        System.out.printf("DIAGONAL = %.2f",form1.diagonal());


    }
}
