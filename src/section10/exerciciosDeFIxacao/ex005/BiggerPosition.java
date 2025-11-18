package section10.exerciciosDeFIxacao.ex005;

import java.util.Locale;
import java.util.Scanner;

public class BiggerPosition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("How many numbers will u type? ");
        int n = in.nextInt();
        double biggerValue = 0;
        int biggerValuePosition = 0;

        for (int i = 0; i<n; i++){
            System.out.println("Type a number: ");
            double number = in.nextInt();
            if(number > biggerValue){
                biggerValue = number;
                biggerValuePosition = i;
            }
        }


        System.out.print("BIGGER NUMBER = "+biggerValue);
        System.out.print("\nBIGGER NUMBER POSITION = "+biggerValuePosition);


    }
}
