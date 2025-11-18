package section10.exerciciosDeFIxacao.ex002;

import java.util.Locale;
import java.util.Scanner;

public class VetorSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("How many numbers will you type? ");
        int n = in.nextInt();
        double[] array = new double[n];
        double sum = 0.0;

        for(int i = 0; i < array.length; i++){
            System.out.print("Type a number: ");
            array[i] = in.nextDouble();
            sum += array[i];
        }

        double media = sum/ array.length;

        System.out.print("Values = ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.printf("\n SUM = %.2f\n", sum);

        System.out.printf("MEDIA = %.2f", media );



        in.close();
    }
}
