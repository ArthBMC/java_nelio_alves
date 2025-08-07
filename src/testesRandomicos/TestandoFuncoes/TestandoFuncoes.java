package testesRandomicos;

import java.util.Scanner;

public class TestandoFuncoes {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Digite 3 numeros abaixo: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println(n1);
        }

        if (n2 > n1 && n2 > n3) {
            System.out.println(n2);
        }
        if (n3 > n1 && n3 > n2) {
            System.out.println(n3);
        }


        in.close();
    }
}
