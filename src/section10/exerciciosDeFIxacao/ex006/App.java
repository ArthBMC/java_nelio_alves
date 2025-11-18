package section10.exerciciosDeFIxacao.ex006;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);


        System.out.print("Quantos valores cada vetor vai ter? ");
        int n = in.nextInt();
        System.out.println("Digite os valores do vetor A: ");
        int[] vetorA = new int[n];
        for (int i = 0; i<vetorA.length; i++){
            vetorA[i] = in.nextInt();
        }


        System.out.println("Digite os valores do vetor B: ");
        int[] vetorB = new int[n];
        for (int i = 0; i<vetorB.length; i++){
            vetorB[i] = in.nextInt();
        }


        System.out.println("VETOR RESULTANTE: ");
        int[] vetorC = new int[n];
        for(int i = 0; i<vetorC.length; i++){
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println(vetorC[i]);
        }


        in.close();

    }
}
