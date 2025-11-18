package section10.matrizes.aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner( System.in).useLocale(Locale.US);


        int n = in.nextInt();

        int[][] matriz = new int [n][n];
        int[] arrayD = new int[n];
        int count = 0;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j< matriz.length; j++){
                matriz[i][j] = in.nextInt();
                if (matriz[i][j] < 0){
                    count += 1;
                }
                if (i == j){
                    arrayD[i] = matriz [i][j];
                }
            }
        }



        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j< matriz.length; j++){
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println();
        }


        System.out.println("Main diagonal: ");
        for (int array : arrayD){
            System.out.print(array + "  ");
        }

        System.out.println("\n\nNegative numbers = " + count);




        in.close();
    }
}
