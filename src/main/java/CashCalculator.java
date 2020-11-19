public class CashCalculator implements Calculator {

    private final Check check;

    public CashCalculator( Check check) {
        this.check = check;
    }

    @Override
    public double calculate() {

        double resultCash;
        if (check.getProduct().isPromotion()) {
            if (check.getQuantity() >= 5) {
                resultCash = check.getProduct().getPrice() * check.getQuantity() * 0.9 ;
            } else {
                resultCash = check.getProduct().getPrice()* check.getQuantity();
            }
        } else {
            resultCash = check.getProduct().getPrice()* check.getQuantity();
        }

        if (check.isDiscount(check.getDiscountCardNumber())) {
            return resultCash * 0.5;
        } else {
            return resultCash;
        }
    }
}
