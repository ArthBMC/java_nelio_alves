package section17.IntroducingMap.tryingUsingClasses.application;

import section17.IntroducingMap.tryingUsingClasses.entities.Product;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {

        Map<Product, Integer> stock = new TreeMap<>();

        Product p1 = new Product("Gun", 5000.0);
        Product p2 = new Product("Axe", 1000.0);
        Product p3 = new Product("Sword", 500.0);
        Product p4 = new Product("Axe", 1200.0);

        stock.put(p1, 100);
        stock.put(p2, 200);
        stock.put(p3, 50);

        stock.put(p4, 25);

        for (Product p: stock.keySet()){
            System.out.println(p);
            System.out.println("Stock: " + stock.get(p));
        }


    }
}
