import java.text.DecimalFormat;
import java.util.Locale;

public class CashCalculator implements Calculator {

    private Storage storage;
    private static double resultCash;

    public CashCalculator( Storage storage) {
        this.storage = storage;
    }

    @Override
    public double calculate() {

        if (storage.getProduct().isPromotion()) {
            if (storage.getQuantity() >= 5) {
                resultCash = storage.getProduct().getPrice() * storage.getQuantity() * 0.9 ;
            } else {
                resultCash = storage.getProduct().getPrice()*storage.getQuantity();
            }
        } else {
            resultCash = storage.getProduct().getPrice()*storage.getQuantity();
        }

        if (storage.isDiscount()) {
            resultCash = resultCash * 0.85;
        }
        return resultCash;
    }
}
