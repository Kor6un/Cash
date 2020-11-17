import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Pen", 0.39, false),
                new Product("Clip", 0.39, true),
                new Product("Pencil", 1.98, false),
                new Product("Ruler", 0.39, true),
                new Product("Copybook", 0.39, false),
                new Product("Protractor", 0.39, false),
                new Product("Mechanical pencil", 0.39, true));

        for (Product p : products) {
            System.out.println(p);
        }

        Set<Integer> cardNumbers = new HashSet<>();
        cardNumbers.add(1233);
        cardNumbers.add(2132);
        cardNumbers.add(6544);
        cardNumbers.add(9875);
        cardNumbers.add(1598);

        System.out.println(cardNumbers);
        Cash cash = new Cash(products.get(0).getCost(), 4, products.get(0).isPromotion());
        double result = cash.calculate(products.get(0).getCost(), 4, products.get(0).isPromotion());
        System.out.println(result);
    }
}
