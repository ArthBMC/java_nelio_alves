package section15.exercise.entities;

public class Products {
    private String name;
    private double price;
    private int quantity;
    private double total;

    public Products(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void totalValue (){
        total = price * quantity;
    }

    public String getName() {
        return name;
    }

    public double getTotal() {
        return total;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
