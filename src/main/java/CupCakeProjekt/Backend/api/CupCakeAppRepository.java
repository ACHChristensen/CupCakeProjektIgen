package CupCakeProjekt.Backend.api;

import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.Bottom;
import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.CupCake;
import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.Topping;
import CupCakeProjekt.Backend.domain.Manufacturing.Orders.OrderLine;
import CupCakeProjekt.Backend.domain.Repositories.CupCakeRepository;
import CupCakeProjekt.Backend.domain.Repositories.OrderRepository;
import CupCakeProjekt.Backend.infrastructure.Database;

import java.util.ArrayList;
import java.util.List;

public class CupCakeAppRepository  {

    private final CupCakeRepository cupCakeRepository;
    private final OrderRepository orderRepository;
    private final List<OrderLine> order = new ArrayList<>();
    private final OrderLine orderLine = null;
    private static final int version = 1;
    private static final Database db = null;

    public CupCakeAppRepository(CupCakeRepository cupCakeRepository, OrderRepository orderRepository) {
        this.cupCakeRepository = cupCakeRepository;
        this.orderRepository = orderRepository;
    }

    public Topping createTop(String flavor){
        Topping top = cupCakeRepository.createTop(flavor);
        return top;
    }

    public Bottom createBottom(String flavor) {
        Bottom bottom = cupCakeRepository.createBottom(flavor);
        return bottom;
    }

    public CupCake createCupcake(Topping top, Bottom bot) {
        CupCake cupCake = new CupCake(bot, top);
        return cupCake;
    }


    private void addToOrder(CupCake cupCake, int quanitity){
        OrderLine orderLine = new OrderLine(cupCake, quanitity);
        order.add(orderLine);
    }

    //TODO public List<OrderLine> createOrder(List<OrderLine> orderlines) {
    //}

    public static int getVersion() {
        return version;
    }
}
