public class Product {

    private String name;

    private double price;

    private boolean promotion;

    public Product(String name, double price, boolean promotion) {
        this.name = name;
        this.price = price;
        this.promotion = promotion;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.promotion = false;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isPromotion() {
        return promotion;
    }

    public void setPromotion(boolean promotion) {
        this.promotion = promotion;
    }

    @Override
    public String toString() {
        return    name + " " + price + "$ " + " promotion: " + promotion;
    }
}
