package testesRandomicos;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        String s1, s2, s3;
        int x;

        Scanner input = new Scanner(System.in);
        x = input.nextInt(); //deixa uma quebra de linha
        input.nextLine(); //serve para consumir a quebra de linha deixada pelo Scanner que não tem nextLine.
        s1 = input.nextLine(); //nextLine() le a linha inteira, inclusive os espaços
        s3 = input.nextLine();
        s2 = input.next();
        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


    }
}
