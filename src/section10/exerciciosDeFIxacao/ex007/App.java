package section10.exerciciosDeFIxacao.ex007;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in).useLocale(Locale.US);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int posicoesVetor = in.nextInt();
        double[] vetor = new double[posicoesVetor];


        double media = 0;

        for (int i = 0; i < vetor.length; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = in.nextDouble();
            media += vetor[i];
        }

        media /= posicoesVetor;
        System.out.println("MEDIA DO VETOR = "+media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (int i = 0; i<vetor.length; i++){
            if(vetor[i]<media){
                System.out.println(vetor[i]);
            }
        }



    }
}
