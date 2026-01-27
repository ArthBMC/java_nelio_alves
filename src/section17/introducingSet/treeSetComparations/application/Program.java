package section17.introducingSet.treeSetComparations.application;

import section17.introducingSet.treeSetComparations.entities.Product;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {

        Set<Product> set = new TreeSet<>();

        set.add(new Product("Iphone 13", 2500.0));
        set.add(new Product("Notebook", 3000.0));
        set.add(new Product("Tv", 1500.0));

        for (Product p : set){
            System.out.println(p.toString());  //para ordenar com o TreeSet, é necessário que a classe implemente o "Comparable<>"
        }
    }
}
