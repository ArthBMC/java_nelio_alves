package section17.introducingSet.testingComparations.application;

import section17.introducingSet.testingComparations.entities.Product;

import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Set<Product> set = new HashSet<>();

        set.add(new Product("Iphone 13", 2500.0));
        set.add(new Product("Notebook", 3000.0));
        set.add(new Product("Tv", 1500.0));

        Product prod = new Product("Tv", 1500.0);

        System.out.println(set.contains(prod)); //Só é verdade porque o Product tem o hashCOde implementado

    }
}
