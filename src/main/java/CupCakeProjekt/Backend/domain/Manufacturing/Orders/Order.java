package CupCakeProjekt.Backend.domain.Manufacturing.Orders;

import java.security.Timestamp;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Order {
    private final List<OrderLine> order;
    private int quanitityOfOrderLines;
    private OrderLine orderLine;
    private final String orderedTime;
    private String pickUpTime;
    private int minutes = Calendar.MINUTE;
    private int hours = Calendar.HOUR;
    private int date = Calendar.DATE;
    private int month = Calendar.MONTH;
    private int year = Calendar.YEAR;
    private double priceTotal;

    public Order(List<OrderLine> orderlines) {
        this.order = orderlines;
        this.orderedTime = nowOrderedTime();
        this.pickUpTime = timeForPickUpOrder();
        this.priceTotal = price();
    }

    private double price(){
        double price = 0.0;
        for (OrderLine o: order) {
            price += o.getPrice();
        }
        return price;
    }

    public String timeForPickUpOrder(){
        int timePerCupcakePerMinute = 6;
        int mintesPerOrderEkstra = 0;
        for (OrderLine o: order){
            mintesPerOrderEkstra =+ (o.getQuanitity() * timePerCupcakePerMinute);
        }
        int hoursPerOrderEkstra = (mintesPerOrderEkstra+minutes)/60;
        int minutesTotal = (mintesPerOrderEkstra + minutes)%60;
        int dateEkstraPerOrder = (hoursPerOrderEkstra + hours)/24;
        int hoursTotal = (hoursPerOrderEkstra + hours)%24;
        int dateTotal = dateEkstraPerOrder + date;
        //TODO (Ret så date ikke bliver højere dage end 30 eller 31 eller 28 eller 29 afhængig af måned
        return minutesTotal + ":" + hoursTotal + " d." + dateTotal + "/" + month + "-" + year;
    }

    public String nowOrderedTime() {
        return minutes + ":" + hours + " d." + date + "/" + month + "-" + year;
    }
    public void setQuanitityOfOrderLines(){
        quanitityOfOrderLines = order.size();
    }

    public double getPriceTotal() {
        return priceTotal;
    }

    @Override
    public String toString() {
        String orderPrint = null;
        for (OrderLine o :order){
            orderPrint += o;
        }
        orderPrint += "\n\t Kan afhentes fra kl: "+ pickUpTime;
        return orderPrint;
    }
}
