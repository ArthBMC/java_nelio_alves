package section10.exerciciosDeFIxacao.ex009;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in).useLocale(Locale.US);

        System.out.print("How many people will you type? ");
        int n = in.nextInt();

        String[] peopleName = new String[n];
        int[] peopleAge = new int[n];
        int olderVariable = 0;
        String olderName = "";

        for (int i = 0; i < peopleName.length; i++){
            System.out.printf("Person %d data: \n", ++i);
            System.out.print("Name: ");
            in.nextLine();
            peopleName[i] = in.nextLine();
            System.out.print("Age: ");
            peopleAge[i] = in.nextInt();
            if (peopleAge[i] > olderVariable){
                olderVariable = peopleAge[i];
                olderName = peopleName[i];
            }
        }
        System.out.print("OLDER PERSON: "+olderName);


        in.close();
    }
}
