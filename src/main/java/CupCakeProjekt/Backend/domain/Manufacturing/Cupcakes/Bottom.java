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

    @Override
    public String toString() {
        return "Bund med smag: "+ flavor + " : "+ price + " kr.";
    }
}
