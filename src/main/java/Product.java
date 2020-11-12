import java.util.Iterator;

public class Product extends Entity {

    private int id;

    private double cost;

    private boolean promotion;

    public Product(String name, int id, double cost, boolean promotion) {
        super(name);
        this.id = id;
        this.cost = cost;
        this.promotion = promotion;
    }

    @Override
    public String toString() {
        return   "id: " + id + " " + this.getName() + " " + cost + "$ " + promotion;
    }
}
