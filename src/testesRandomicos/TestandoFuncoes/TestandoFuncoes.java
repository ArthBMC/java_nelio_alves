package testesRandomicos.TestandoFuncoes;

import java.util.Scanner;

public class TestandoFuncoes {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Digite 3 numeros abaixo: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();

        int maior = maximo (n1, n2, n3);
        showResult(maior);

        in.close();
    }

    public static int maximo (int n1, int n2, int n3) {

        int maior = 0;

        if (n1 > n2 && n1 > n3) {
            maior = n1;
        }

        if (n2 > n1 && n2 > n3) {
            maior = n2;
        }
        if (n3 > n1 && n3 > n2) {
            maior = n3;
        }
        return maior;
    }

    public static void showResult (int result){
        System.out.println("O maior numero é: " + result);
    }
}

