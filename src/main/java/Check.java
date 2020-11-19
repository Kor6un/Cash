import java.util.HashSet;
import java.util.Set;

public class Check implements Discount {

    private Product product;

    private int quantity;

    private int discountCardNumber;

    public Check(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Check(Product product, int quantity, int discount) {
        this.product = product;
        this.quantity = quantity;
        this.discountCardNumber = discount;
    }

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

    public int getDiscountCardNumber() {
        return discountCardNumber;
    }

    public void setDiscountCardNumber(int discountCardNumber) {
        this.discountCardNumber = discountCardNumber;
    }

    @Override
    public String toString() {
        return product + " quantity: " + quantity + " cash: " /*+ this.getCash() + "$"*/;
    }


    @Override
    public boolean isDiscount(int discountCardNumber) {

        Set<Integer> cardNumbers = new HashSet<>();
        cardNumbers.add(1233);
        cardNumbers.add(2132);
        cardNumbers.add(6544);
        cardNumbers.add(9875);
        cardNumbers.add(1598);

        return cardNumbers.contains(discountCardNumber);
    }
}
