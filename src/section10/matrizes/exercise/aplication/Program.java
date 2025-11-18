package section10.matrizes.exercise.aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        int m = in.nextInt();
        int n = in.nextInt();

        Integer[][] mat = new Integer[m][n];

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = in.nextInt();
            }
        }

        int x = in.nextInt();

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){

                if (x == mat[i][j]){
                    System.out.println("Position "+i+", "+j+":");
                    if ((j-1) >= 0){
                        System.out.println("Left: "+mat[i][j-1]);
                    }
                    if ((j+1) < mat[i].length){
                        System.out.println("Right: "+mat[i][j + 1]);
                    }
                    if ((i-1) >= 0 ){
                        System.out.println("Up: "+mat[i-1][j]);
                    }
                    if ((i+1) < mat.length ){
                        System.out.println("Down: "+mat[i+1][j]);
                    }
                }

            }
        }






    }
}
