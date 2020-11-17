import java.util.Iterator;

public class Product {

    private String name;

    private double cost;

    private boolean promotion;

    public Product(String name, double cost, boolean promotion) {
        this.name = name;
        this.cost = cost;
        this.promotion = promotion;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public boolean isPromotion() {
        return promotion;
    }

    @Override
    public String toString() {
        return    name + " " + cost + "$ ";
    }
}
