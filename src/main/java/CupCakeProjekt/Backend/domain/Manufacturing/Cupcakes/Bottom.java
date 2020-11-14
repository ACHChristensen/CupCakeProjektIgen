package CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes;

public class Bottom {

    private final String flavor;
    private final double price;

    public Bottom(String flavor, double price) {
        this.flavor = flavor;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getFlavor() {
        return flavor;
    }

    @Override
    public String toString() {
        return flavor;
    }
}
