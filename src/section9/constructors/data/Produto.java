package section9.constructors.data;

public class Produto {

    public String name;
    public double price;
    public int quantity;

    public Produto (String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Produto (String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double totalValueStock(){
        return price*quantity;
    }

    public void addProducts (int quantity){
         this.quantity+= quantity;
    }

    public void removeProducts (int quantity){
        this.quantity -= quantity;
    }

    @Override
    public String toString (){
        return name
                + ", $ "
                + String.format("%.2f",price)
                + ", "
                + quantity
                + " units"
                + ", Total: $ "
                + String.format("%.2f",totalValueStock());
    }

}
