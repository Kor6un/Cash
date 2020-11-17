public class Cash {

    private double cost;

    private int quantity;

    private boolean promotion;

    public Cash(double cost, int quantity, boolean promotion) {
        this.cost = cost;
        this.quantity = quantity;
        this.promotion = promotion;
    }

    public double calculate(double cost, int quantity, boolean promotion) {
        if (promotion == true) {
            return quantity*cost*0.10;
        }
        return cost * quantity;
    }
}
