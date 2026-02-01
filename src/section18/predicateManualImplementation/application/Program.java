package section18.predicateManualImplementation.application;

import section18.predicateManualImplementation.entities.Product;
import section18.predicateManualImplementation.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add( new Product("Tv", 900.0));
        list.add( new Product("HD Case", 80.90));
        list.add( new Product("Tablet", 450.0));
        list.add( new Product("Mouse", 50.0));

        Predicate<Product> pred = p -> p.getPrice() >= 100;

        //list.removeIf(new ProductPredicate()); interface criada explicitamente
        //list.removeIf(Product::staticPredicateMethod); metodo estatico implementado dentro da classe
        //list.removeIf(Product::nonStaticPredicateMethod); metodo de instancia dentro da classe
        //list.removeIf(pred); criando o predicate na classe program
        list.removeIf(p -> p.getPrice() >= 100);

        for (Product p : list){
            System.out.println(p);
        }

    }
}
