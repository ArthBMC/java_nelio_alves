package section10.exerciciosDeFIxacao.ex010;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in).useLocale(Locale.US);

        System.out.print("How many students will be typed? ");
        int n = in.nextInt();
        in.nextLine();
        String[] names = new String[n];
        double avgGrade = 0;
        String[] approvedNames = new String[n];

        for (int i = 0; i<names.length; i++) {
            System.out.printf("Type the name, first and second grade %do aluno: \n", i);
            names[i] = in.nextLine();
            double grade1 = in.nextDouble();
            double grade2 = in.nextDouble();
            in.nextLine();
            avgGrade = (grade1+grade2)/2;
            if (avgGrade >= 6.0 ){
                approvedNames[i] = names[i];
            }
        }

        System.out.println("Approved strudents: ");
        for (int i = 0; i<approvedNames.length; i++){
            if (approvedNames[i] != null){
                System.out.println(approvedNames[i]);
            }
        }



        in.close();


    }
}
