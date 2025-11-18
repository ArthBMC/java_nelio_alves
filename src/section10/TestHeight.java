package section10;

import java.util.Locale;
import java.util.Scanner;

public class TestHeight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Quantas posições terá o array? ");
        int n = in.nextInt();
        double[] height = new double[n];

        double avg = 0;
        for (int i = 0; i < height.length; i++){
            height[i] = in.nextDouble();
            avg += height[i];
        }
        avg /= height.length;
        System.out.println(avg);
        in.close();
    }
}
