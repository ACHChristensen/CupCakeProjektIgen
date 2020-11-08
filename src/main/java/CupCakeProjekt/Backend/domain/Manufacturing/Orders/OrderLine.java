package CupCakeProjekt.Backend.domain.Manufacturing.Orders;

import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.CupCake;


public class OrderLine {
    private final CupCake cupCake;
    private final int quanitity;
    private double price;
    private final String orderedTime;
    private String pickUpTime;
    // TODO private boolean pickedUp;

    public OrderLine(CupCake cupCake, int quanitity) {
        this.cupCake = cupCake;
        this.quanitity = quanitity;
        this.orderedTime = nowOrderedTime();
    }

    public double getPrice(){
        price = cupCake.getPrice()*quanitity;
        return price;
    }

    public String nowOrderedTime() {
        //TODO
        return "";
    }
}
