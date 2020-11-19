import java.util.HashSet;
import java.util.Set;

public class Cash implements Discount {

    private Product product;

    private int quantity;

    private int discountCardNumber;

    public Cash(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Cash(Product product, int quantity, int discountCardNumber) {
        this.product = product;
        this.quantity = quantity;
        this.discountCardNumber = discountCardNumber;
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

        if (!isDiscount(discountCardNumber)) {
            return product + "   quantity: " + quantity /*+ " cash: " + this.getCash() + "$"*/;
        } else {
            return  product + "   quantity: " + quantity + "   dicountCardNumber: " + discountCardNumber;
        }
    }


    @Override
    public boolean isDiscount(int discountCardNumber) {

        Set<Integer> cardNumbers = new HashSet<>();
        cardNumbers.add(1234);
        cardNumbers.add(2132);
        cardNumbers.add(6544);
        cardNumbers.add(9875);
        cardNumbers.add(1598);

        return cardNumbers.contains(discountCardNumber);
    }
}
