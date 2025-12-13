package section13.polimorfism.exercicioFixacao.entities;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private double price;

    public Product(){
    }

    private final List<Product> productList = new ArrayList<>();

    public Product (String name, double price){
        this.name = name;
        this.price = price;
    }

    public void addList(Product product){
        productList.add(product);
    }

    public void removeList(Product product){
        productList.remove(product);
    }



    public String priceTag(){
        return name + " $ " + String.format("%.2f",price);
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public List<Product> getProductList() {
        return productList;
    }
}
