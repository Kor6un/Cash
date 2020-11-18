import java.util.HashSet;
import java.util.Set;

public class Storage implements Calculator, Discount {

    private Product product;

    private int quantity;

    public Storage(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;

    }

//    public double getCash() {
//        if (product.isPromotion() && this.quantity >= 5 ) {
//            return product.getPrice() * 0.9 * quantity;
//        }
//        return product.getPrice() * quantity;
//    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return product + " quantity: " + quantity + " cash: " /*+ this.getCash() + "$"*/;
    }

    @Override
    public double calculate() {
        return product.getPrice() * quantity;
    }

    @Override
    public boolean isDiscount() {

        Set<Integer> cardNumbers = new HashSet<>();
        cardNumbers.add(1233);
        cardNumbers.add(2132);
        cardNumbers.add(6544);
        cardNumbers.add(9875);
        cardNumbers.add(1598);

        if (cardNumbers.contains(4233)) {
            return !product.getClass().getName().isEmpty() && product.isPromotion();
        } else {
            return false;
        }
    }
}
