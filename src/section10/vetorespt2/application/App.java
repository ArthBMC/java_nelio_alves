package section10.vetorespt2.application;

import section10.vetorespt2.entities.Products;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in).useLocale(Locale.US);

        int array = in.nextInt();

        Products[] product1 = new Products[array];

        for (int i = 0; i<array; i ++){
            in.nextLine();
            String name = in.nextLine();
            double price = in.nextDouble();
            product1[i] = new Products(name, price);
        }


        double sum = 0.0;
        for (int i = 0; i < array; i++){
            sum += product1[i].getPrice();
        }

        double avg = sum/array;
        System.out.println("AVERAGE PRICE = "+ avg);
        in.close();

    }
}
