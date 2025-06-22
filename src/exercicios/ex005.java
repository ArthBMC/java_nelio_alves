package exercicios;
import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int codigo = in.nextInt();
        int qnt = in.nextInt();

        double resultado = 0;

        if (codigo == 1) {
            resultado = qnt * 4.0;
        }
        if (codigo == 2){
            resultado = qnt * 4.5;
        }
        if (codigo == 3){
            resultado = qnt * 5.0;
        }
        if (codigo == 4) {
            resultado = qnt * 2.0;
        }
        if (codigo == 5) {
            resultado = qnt * 1.5;
        }

        System.out.printf("Total: R$ %.2f", resultado);
        in.close();

        }

}
