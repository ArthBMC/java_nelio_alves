package section18.comparatorAndLambda.application;

import section18.comparatorAndLambda.entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add( new Product("Tv", 900.0));
        list.add( new Product("Notebook", 1200.0));
        list.add( new Product("Tablet", 450.0));

        Comparator<Product> comparator = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };


        //list.sort(new MyComparator());  maneira criando uma interface

        Comparator<Product> comparatorLambda = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        //list.sort(comparatorLambda); // criando o metodo dentro da classe principal

        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase())); // usando lambda no proprio sort


        for (Product p : list){
            System.out.println(p);
        }

    }
}
