package CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes;

public class CupCake {
    //TODO Skal alle der er final (altså konstante) skrives med stort?
    private final Bottom bottom;
    private final Topping topping;
    private final double price;

    public CupCake(Bottom bottom, Topping topping) {
        this.bottom = bottom;
        this.topping = topping;
        this.price = priceCalculated();
         }

    public double priceCalculated(){
        double tmpPrice = topping.getPrice() + bottom.getPrice();
        return tmpPrice;
    }

    public final double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return " bund: " + bottom +
                "+ topping: " + topping;
    }
}
