public class CashCalculator implements Calculator {

    private Product product;

    private int quantity;

    private boolean promotion;

    public CashCalculator(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public CashCalculator(Product product, int quantity, boolean promotion) {
        this.product = product;
        this.quantity = quantity;
        this.promotion = promotion;
    }

    public double getCash() {
        return product.getCost() * quantity;
    }

    public double getCash(boolean promotion) {
        if (promotion == true && this.quantity >= 5 ) {
            return product.getCost() * 0.9 * quantity;
        }
        return product.getCost() * quantity;
    }

    @Override
    public String toString() {
        return product + " quantity: " + quantity + " cash: " + this.getCash(promotion) + "$";
    }

    @Override
    public double calculate() {
        return product.getCost()*quantity;
    }
}
