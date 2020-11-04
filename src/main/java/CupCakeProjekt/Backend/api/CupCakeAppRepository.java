package CupCakeProjekt.Backend.api;

import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.Bottom;
import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.CupCake;
import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.Topping;
import CupCakeProjekt.Backend.domain.Manufacturing.Orders.OrderLine;
import CupCakeProjekt.Backend.domain.Repositories.CupCakeRepository;
import CupCakeProjekt.Backend.domain.Repositories.OrderRepository;

import java.util.ArrayList;
import java.util.List;

public class CupCakeAppRepository  {

    CupCakeRepository cupCakeRepository;
    OrderRepository orderRepository;
    List<OrderLine> order = new ArrayList<>();
    OrderLine orderLine = null;

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
}
