import java.util.Set;

public class DiscountCalculator implements Calculator {
    private Set<Integer> discountNumbers;

    public DiscountCalculator(Set<Integer> discountNumbers) {
        this.discountNumbers = discountNumbers;
    }

    @Override
    public double calculate() {
        return 0;
    }
}
