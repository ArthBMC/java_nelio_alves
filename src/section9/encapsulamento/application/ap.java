package section9.encapsulamento.application;

import section9.encapsulamento.data.Produto;

import java.util.Locale;
import java.util.Scanner;

public class ap {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);
        System.out.print("Enter product data: \n");
        System.out.print("Enter name: ");
        String name = in.nextLine();
        System.out.print("Enter price: ");
        double price = in.nextDouble();
        System.out.print("Enter quantity in stock: ");
        int quantity = in.nextInt();

        Produto product1 = new Produto(name, price, quantity);

        product1.setName("Meu piru");
        System.out.println("Updated name: " + product1.getName());

        System.out.println("Product data: "+ product1);

        System.out.print("Enter with a number to add in stock: ");
        quantity = in.nextInt();
        product1.addProducts(quantity);
        System.out.println("Updated data: "+ product1);

        System.out.print("Enter with a number to remove in stock: ");
        quantity = in.nextInt();
        product1.removeProducts(quantity);
        System.out.println("Updated data: "+ product1);



        in.close();
    }
}
