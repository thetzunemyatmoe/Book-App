import java.time.LocalDate;
public class Shipping{
    private final Order orderObj;
    private final LocalDate shipDate;
    private double shipCost;
    public static int countUrgent;

    public Shipping(Order orderObj,LocalDate shipDate){
        this.orderObj = orderObj;
        this.shipDate = shipDate;

    }

    public LocalDate getShipDate() {
        return shipDate;
    }

    public double getShipCost() {
        return shipCost;
    }

    public void setShipCost(double shipCost) {
        this.shipCost = shipCost;
    }
    public double calcShipCost(boolean isUrgent) {
        if (isUrgent) {
            shipCost = 5.45;
            countUrgent++;
        } else {
            shipCost = 3.95;
        }
        return shipCost;

    }
}

