package CupCakeProjekt.Backend.domain.Repositories;


import CupCakeProjekt.Backend.domain.Manufacturing.Orders.OrderFactory;
import CupCakeProjekt.Backend.domain.Manufacturing.Orders.OrderLine;
import java.util.ArrayList;

public interface OrderRepository extends OrderFactory {

    private static void deleteOrder(ArrayList<OrderLine> order) {

    }
    //TODO

    private static void deleteOrderLine(OrderLine orderLine) {

    }
    //TODO

    private static ArrayList<OrderLine> findOrder(int orderID){
        return null;
    }

}
