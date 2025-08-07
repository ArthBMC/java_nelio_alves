package section8.exercicioTrianguloComPoo.application;

import section8.exercicioTrianguloComPoo.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        Triangle x,y;

        x = new Triangle();
        y = new Triangle();

        System.out.println("Digite os 3 lados do triangulo X: ");
        x.a = in.nextDouble();
        x.b = in.nextDouble();
        x.c = in.nextDouble();

        System.out.println("Digite os 3 lados do triangulo X: ");
        y.a = in.nextDouble();
        y.b = in.nextDouble();
        y.c = in.nextDouble();

        double areaX = x.calculoArea();
        double areaY = y.calculoArea();

        if (areaX > areaY) {
            System.out.println("O triangulo de area maior eh o T1");
        }else  {
            System.out.println("O triangulo de area maior eh o T2");
        }

    }
}
