package exercicios;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = in.nextInt();

        if(num % 2 != 0){
            System.out.println("ÍMPAR");
        }else {
            System.out.println("PAR");
        }


    }
}
