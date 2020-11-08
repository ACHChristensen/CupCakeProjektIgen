package CupCakeProjekt.Backend.domain.Repositories;


import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.CupCake;
import CupCakeProjekt.Backend.domain.Manufacturing.Orders.Order;
import CupCakeProjekt.Backend.domain.Manufacturing.Orders.OrderFactory;
import CupCakeProjekt.Backend.domain.Manufacturing.Orders.OrderLine;
import java.util.ArrayList;
import java.util.List;

public interface OrderRepository extends OrderFactory {
    //TDDO
    private static void deleteOrder(ArrayList<OrderLine> order) {  }
    //TODO

    private static void deleteOrderLine(OrderLine orderLine) {  }
    //TODO

    private static ArrayList<OrderLine> findOrder(int orderID){
        return null;
    }

    //TODO
    private static void addToOrder(OrderLine orderLine) { };

    OrderLine addAsOrderLine(CupCake cupCake, int quanitity);

}
