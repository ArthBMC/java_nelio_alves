package section10.exerciciosDeFIxacao.ex004;

import java.util.Locale;
import java.util.Scanner;

public class application {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in).useLocale(Locale.US);

        System.out.print("How many numbers will u type? ");
        int n = in.nextInt();
        int[] array = new int[n];
        int count = 0;

        for (int i = 0; i< array.length; i++){
            System.out.println("Type a number: ");
            int number = in.nextInt();
            if (number%2 == 0 ) {
                array[i] = number;
                count += 1;
            }
        }

        System.out.println("Numbers of pairs: ");
        for(int i = 0; i< array.length; i++){
            if(array[i] != 0) {
                System.out.print(array[i] + "  ");
            }
        }

        System.out.print("\n\nPairs quantity = " + count);


    }
}

