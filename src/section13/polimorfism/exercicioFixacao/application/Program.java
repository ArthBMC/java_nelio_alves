package section13.polimorfism.exercicioFixacao.application;

import section13.polimorfism.exercicioFixacao.entities.ImportedProduct;
import section13.polimorfism.exercicioFixacao.entities.Product;
import section13.polimorfism.exercicioFixacao.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = in.nextInt();
        in.nextLine();

        Product product = new Product();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char isUsed = in.next().charAt(0);
            in.nextLine();
            System.out.print("Name: ");
            String name = in.nextLine();
            System.out.print("Price: ");
            double price = in.nextDouble();
            if (isUsed == 'c') {
                Product product1 = new Product(name, price);
                product.addList(product1);
            } else if (isUsed == 'i') {
                System.out.print("Customs fee: ");
                double fee = in.nextDouble();
                Product importedProduct = new ImportedProduct(name, price, fee);
                product.addList(importedProduct);
            } else {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                in.nextLine();
                Date manufacture = sdf1.parse(in.nextLine());
                Product usedProduct = new UsedProduct(name, price, manufacture);
                product.addList(usedProduct);
            }
        }
        System.out.println("\nPRICE TAGS: ");
        for (Product p: product.getProductList()){
            System.out.println(p.priceTag());
        }

    }
}
