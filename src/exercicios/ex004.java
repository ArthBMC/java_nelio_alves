package exercicios;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int resultado = 0;
        System.out.print("Digite a hora inicial do jogo: ");
        int horaInicial = in.nextInt();
        System.out.print("Digite a hora final do jogo: ");
        int horaFinal = in.nextInt();

        if(horaFinal > horaInicial){
            resultado = horaFinal - horaInicial;
        }else{
            if (horaInicial == horaFinal){
                resultado = 24;
            }else{
                horaFinal += 24;
                resultado = horaFinal - horaInicial;
            }
        }

        if(resultado < 1 || resultado > 24){
            System.out.println("Duração incompatível.");
        }else{
            System.out.printf("O JOGO DUROU %d HORA(S)", resultado);
        }


    }
}
