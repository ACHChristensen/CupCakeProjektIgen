package CupCakeProjekt.Backend.domain.Manufacturing.Orders;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<OrderLine> order;
    private int quanitityOfOrderLines;
    private OrderLine orderLine;


    protected Order(OrderLine orderline) {
        this.order = new ArrayList<>();
        this.orderLine = orderline;
    }

    public void setQuanitityOfOrderLines(){
        quanitityOfOrderLines = order.size();
    }
}
