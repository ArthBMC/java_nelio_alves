package section8.exercicioEstoque.application;

import section8.exercicioEstoque.data.Produto;

import java.util.Locale;
import java.util.Scanner;

public class ap {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        Produto product1 = new Produto();

        System.out.print("Enter product data: \n");
        System.out.print("Enter name: ");
        product1.name = in.nextLine();
        System.out.print("Enter price: ");
        product1.price = in.nextDouble();
        System.out.print("Enter quantity in stock: ");
        product1.quantity = in.nextInt();

        System.out.println("Product data: "+ product1);

        System.out.print("Enter with a number to add in stock: ");
        int quantity = in.nextInt();
        product1.addProducts(quantity);
        System.out.println("Updated data: "+ product1);

        System.out.print("Enter with a number to remove in stock: ");
        quantity = in.nextInt();
        product1.removeProducts(quantity);
        System.out.println("Updated data: "+ product1);



        in.close();
    }
}
