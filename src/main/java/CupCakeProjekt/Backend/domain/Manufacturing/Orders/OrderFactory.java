package CupCakeProjekt.Backend.domain.Manufacturing.Orders;

import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.CupCake;

public interface OrderFactory {


    static OrderLine addAsOrderLine(CupCake cupCake, int quanitity) {
        return new OrderLine(cupCake,quanitity);
    }

}
