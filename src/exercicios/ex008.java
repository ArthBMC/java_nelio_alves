package exercicios;

import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double salario = in.nextDouble();
        double imposto = 0;
        if(salario < 2000.00){
            System.out.println("ISENTO");
        }else {
            if(salario < 3000.00){
                imposto = ((salario - 2000.00) * 8)/100;
            }else{
                if(salario < 4500.00){
                    imposto = 80.00+(((salario - 3000) *18)/100);
                }else {
                    imposto = 80.00 + 270.00 + (((salario - 4500) *28)/100);
                }
            }
        }
        System.out.printf("%.2f",imposto);
    }
}
