package exercicios;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = in.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = in.nextInt();

        if(n1 > n2){
            if (n1 % n2 != 0){
                System.out.println("Não são múltiplos.");
            }else {
                System.out.println("São múltiplos.");
            }
        }else {
            if (n2 % n1 != 0){
                System.out.println("Não são múltiplos.");
            }else {
                System.out.println("São múltiplos.");
            }
        }
    }
}
