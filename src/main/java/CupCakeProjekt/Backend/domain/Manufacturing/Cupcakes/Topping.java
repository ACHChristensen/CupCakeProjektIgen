package CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes;

public class Topping {

    private final String flavor;
    private final double price;

    public Topping(String flavor, double price) {
        this.flavor = flavor;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Topping med smag: "+ flavor + " : "+ price + " kr.";
    }
}
