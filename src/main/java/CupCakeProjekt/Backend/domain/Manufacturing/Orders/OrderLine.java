package CupCakeProjekt.Backend.domain.Manufacturing.Orders;

import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.CupCake;


public class OrderLine {
    private final CupCake cupCake;
    private final int quanitity;
    private double price;
    // TODO private boolean pickedUp;

    public OrderLine(CupCake cupCake, int quanitity) {
        this.cupCake = cupCake;
        this.quanitity = quanitity;
        price = getPrice();
    }

    public double getPrice(){
        double pricetmp = cupCake.getPrice()*quanitity;
        return pricetmp;
    }

    public int getQuanitity() {
        return quanitity;
    }

    public CupCake getCupCake() {
        return cupCake;
    }

    @Override
    public String toString() {
        return cupCake + " x " + quanitity + " stk"+
                "\n\t\t\t\tpris = " + price + "kr.\n";
    }
}
