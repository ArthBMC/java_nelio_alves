package section10.exerciciosDeFIxacao.ex001;

import java.util.Locale;
import java.util.Scanner;

public class Negatives {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in).useLocale(Locale.US);

        System.out.print("How many numbers will you type? ");
        int n = in.nextInt();

        int[] array = new int[n];

        for (int i = 0; i< array.length; i++){
            System.out.print("Type a number: ");
            array[i] = in.nextInt();
        }

        System.out.println("NEGATIVE NUMBERS: ");
        for (int i = 0; i<array.length; i++ ){
            if (array[i] < 0) {
                System.out.println(array[i]);
            }
        }


        in.close();
    }
}
