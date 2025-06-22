package exercicios;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = in.nextInt();
        if (num < 0){
            System.out.println("NEGATIVO");
        }else {
            System.out.println("POSITIVO");
        }

    }
}
