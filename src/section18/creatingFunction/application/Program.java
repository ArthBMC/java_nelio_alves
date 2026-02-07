package section18.creatingFunction.application;

import section18.creatingFunction.entities.Product;
import section18.creatingFunction.model.services.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add( new Product("Tv", 900.0));
        list.add( new Product("HD Case", 80.90));
        list.add( new Product("Tablet", 350.50));
        list.add( new Product("Mouse", 50.0));

        ProductService ps = new ProductService();

        Double sum = ps.filteredPrice(list, p -> p.getName().charAt(0) == 'T');

        System.out.println("Sum = " + String.format("%.2f", sum));
   }
}
