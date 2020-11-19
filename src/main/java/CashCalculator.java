public class CashCalculator implements Calculator {

    private final Cash cash;

    public CashCalculator( Cash cash) {
        this.cash = cash;
    }

    @Override
    public double calculate() {

        double resultCash;
        if (cash.getProduct().isPromotion()) {
            if (cash.getQuantity() >= 5) {
                resultCash = cash.getProduct().getPrice() * cash.getQuantity() * 0.9 ;
            } else {
                resultCash = cash.getProduct().getPrice()* cash.getQuantity();
            }
        } else {
            resultCash = cash.getProduct().getPrice()* cash.getQuantity();
        }

        if (cash.isDiscount(cash.getDiscountCardNumber())) {
            return resultCash * 0.5;
        } else {
            return resultCash;
        }
    }
}
