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
        return topping.getPrice() + bottom.getPrice();
    }

    public double getPrice() {
        return price;
    }
}
