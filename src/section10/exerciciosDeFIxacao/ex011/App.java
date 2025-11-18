package section10.exerciciosDeFIxacao.ex011;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("How many people will be typed? ");
        int n = in.nextInt();

        double[] height = new double[n];
        char[] gender = new char[n];
        double lowestHeight = 0;
        double highestHeight = 0;
        int numberOfMen = 0;
        int numberOfWomen = 0;
        double avgWomenHeight = 0;

        for (int i = 0; i< height.length; i++){
            System.out.printf("Height of the person %d :", i+1);
            height[i] = in.nextDouble();
            if (i == 0){
                highestHeight = height[i];
                lowestHeight = height[i];
            }else if (height[i] > highestHeight){
                highestHeight = height[i];
            }else if (height[i] < lowestHeight){
                lowestHeight = height[i];
            }
            System.out.printf("Gender of the person %d :", i+1);
            gender[i] = in.next().charAt(0);
            if (gender[i] == 'F' || gender[i] == 'f') {
                avgWomenHeight += height[i];
                numberOfWomen += 1;
            }else{
                numberOfMen += 1;
            }

        }

        avgWomenHeight /= numberOfWomen;


        System.out.println("Lowest Height = " +lowestHeight);
        System.out.println("Highest Height = "+highestHeight);
        System.out.printf("Average women height = %.2f", avgWomenHeight);
        System.out.println("\nNumber of men = "+numberOfMen);




        in.close();
    }
}
