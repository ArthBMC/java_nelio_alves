package Section12.composicoes.Exercicio3.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private final Date moment;
    private final OrderStatus status;

    private final List<OrderItem> itemList = new ArrayList<>();
    private final Client client;

    public Order (Date moment, OrderStatus status, Client client){
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public void addItem (OrderItem item){
        itemList.add(item);
    }

    public void removeItem (OrderItem item){
        itemList.remove(item);
    }


    public Double total (){
        Double total = 0.0;
        for (OrderItem o: itemList){
            total += o.subTotal();
        }

        return total;
    }

    public String showOrder (){
        StringBuilder itemSb = new StringBuilder();
        for (OrderItem o: itemList){
            itemSb.append(o.getProduct().getName()).append( ", ");
            itemSb.append(String.format("$%.2f, ",o.getPrice()));
            itemSb.append("Quantity: ").append(o.getQuantity()).append( ", ");
            itemSb.append(String.format("Subtotal: %.2f\n",o.subTotal()));
        }
        return itemSb.toString();
    }


    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("ORDER SUMMARY: ");
        sb.append("\nOrder moment: ").append(sdf1.format(moment));
        sb.append("\nOrder status: ").append(status);
        sb.append("\nClient:  ").append(client.getName()).append(" ").
                append(client.getBirthDate()).append(" - ").
                append(client.getEmail());
        sb.append("\nOrder items: \n");
        sb.append(showOrder());
        sb.append("Total Price: ").append(String.format("$%.2f", total()));


        return sb.toString();
    }







}
