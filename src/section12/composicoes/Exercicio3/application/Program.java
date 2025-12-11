package section12.composicoes.Exercicio3.application;

import section12.composicoes.Exercicio3.entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = in.nextLine();
        System.out.print("Email: ");
        String email = in.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf1.parse(in.nextLine());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = in.nextLine();
        OrderStatus statusP = OrderStatus.valueOf(status);
        Order order = new Order(new Date(), statusP, client);
        System.out.print("How many items to this order? ");
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++){
            System.out.println("Enter #"+(i+1)+ " item data:");
            System.out.print("Product name: ");
            String nameProduct = in.nextLine();
            System.out.print("Product price: ");
            Double price = in.nextDouble();
            System.out.print("Quantity: ");
            int quantity = in.nextInt();
            in.nextLine();
            Product product = new Product(nameProduct, price);
            OrderItem orderItem = new OrderItem(quantity, price, product);
            order.addItem(orderItem);
        }

        System.out.println(order.toString());



    }
}
