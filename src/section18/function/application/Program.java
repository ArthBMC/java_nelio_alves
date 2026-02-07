package section18.function.application;

import section18.function.entities.Product;
import section18.function.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add( new Product("Tv", 900.0));
        list.add( new Product("HD Case", 80.90));
        list.add( new Product("Tablet", 450.0));
        list.add( new Product("Mouse", 50.0));

        Function<Product, String> toUpper = p -> p.getName().toUpperCase();

        //List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        //List<String> names = list.stream().map(Product::staticToUpper).collect(Collectors.toList());
        //List<String> names = list.stream().map(Product::nonStaticToUpper).collect(Collectors.toList());
        //List<String> names = list.stream().map(toUpper).collect(Collectors.toList());
        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        names.forEach(System.out::println);

    }
}
