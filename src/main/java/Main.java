import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Pen", 0.39),
                new Product("Clip", 0.39),
                new Product("Pencil", 1.98),
                new Product("Ruler", 0.39),
                new Product("Copybook", 0.39),
                new Product("Protractor", 0.39),
                new Product("Mechanical pencil", 0.39));

        Set<Integer> cardNumbers = new HashSet<>();
            cardNumbers.add(1233);
            cardNumbers.add(2132);
            cardNumbers.add(6544);
            cardNumbers.add(9875);
            cardNumbers.add(1598);

        CashCalculator cashCalculator = new CashCalculator(products.get(2), 1500);

        if (cardNumbers.contains(1233)) {
            System.out.println("yes");
        } else
            System.out.println("no");


        System.out.println(cashCalculator);
        System.out.println(cashCalculator.calculate());

    }
}
