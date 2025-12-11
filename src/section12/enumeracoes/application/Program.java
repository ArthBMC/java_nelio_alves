package section12.enumeracoes.application;

import section12.enumeracoes.entities.Order;
import section12.enumeracoes.entitiesEnums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Order order = new Order (1000, new Date(), OrderStatus.PENDING_PAYMENT);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        //é possível usar uma String para instanciar um Enum, basta ser igual ao que está dentro do Enum

        System.out.println(order);
        System.out.println(os1);
        System.out.println(os2);




    }
}
