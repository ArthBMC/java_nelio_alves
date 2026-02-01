package section18.consumerFunction.application;

import section18.consumerFunction.entities.Product;
import section18.consumerFunction.util.ConsumerProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add( new Product("Tv", 900.0));
        list.add( new Product("HD Case", 80.90));
        list.add( new Product("Tablet", 450.0));
        list.add( new Product("Mouse", 50.0));

        Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);

        list.forEach(new ConsumerProduct()); //interface explicita
        list.forEach(Product::staticAccept); //metodo estatico que implementa interface dentro da classe
        list.forEach(Product::nonStaticAccept); //metodo de instancia dentro da classe
        list.forEach(cons); //metodo criado na classe program
        list.forEach(p-> p.setPrice(p.getPrice() * 1.1)); 


        list.forEach(System.out::println);

    }
}
