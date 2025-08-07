package exercicioTriangulo;

import java.util.Locale;
import java.util.Scanner;

public class exercicioSemPoo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("Digite os 3 lados do triangulo 1: ");
        double t1L1 = in.nextDouble();
        double t1L2 = in.nextDouble();
        double t1L3 = in.nextDouble();

        System.out.println("Digite os 3 lados do triangulo 2: ");
        double t2L1 = in.nextDouble();
        double t2L2 = in.nextDouble();
        double t2L3 = in.nextDouble();

        double perimetroT1 = (t1L1 + t1L2 + t1L3) / 2;
        double perimetroT2 = (t2L1 + t2L2 + t2L3) / 2;

        double areaT1 = Math.sqrt(perimetroT1 * (perimetroT1 - t1L1) * (perimetroT1 - t1L2 ) * (perimetroT1 - t1L3));
        double areaT2 = Math.sqrt(perimetroT2 * (perimetroT2 - t2L1) * (perimetroT2 - t2L2 ) * (perimetroT2 - t2L3));

        System.out.printf("Area do triangulo 1: %.4f \n", areaT1);
        System.out.printf("Area do triangulo 2: %.4f\n", areaT2);

        if (areaT1 > areaT2) {
            System.out.println("O triangulo de area maior eh o T1");
        }else  {
            System.out.println("O triangulo de area maior eh o T2");
        }
    }
}
