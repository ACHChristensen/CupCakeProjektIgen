package CupCakeProjekt.Backend.domain.Manufacturing.Orders;

import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.CupCake;

import java.util.ArrayList;
import java.util.List;

public interface OrderFactory {

    //TODO
    /*List<OrderLine> order = new ArrayList<>();
    OrderLine orderLine = null;*/

    private static void addAsOrderLine (CupCake cupCake, int quanitity){
        OrderLine orderLine = new OrderLine(cupCake, quanitity);
    }


}
