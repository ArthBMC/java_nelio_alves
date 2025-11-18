package section10.exerciciosDeFIxacao.ex008;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in).useLocale(Locale.US);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int posicoesVetor = in.nextInt();

        int[] vetor = new int[posicoesVetor];
        double media = 0;
        int count = 0;
        for(int i = 0; i < vetor.length; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = in.nextInt();
            if (vetor[i] %2 == 0){
                count += 1;
                media += vetor[i];
            }
        }

        media /= count;
        if(count != 0){
            System.out.printf("MEDIA DOS PARES = %.1f", media);
        }else {
            System.out.print("NENHUM NUMERO PAR");
        }

        in.close();

    }
}
