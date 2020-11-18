import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Pen", 0.5, true),
                new Product("Clip", 0.39, false),
                new Product("Pencil", 1.98, false),
                new Product("Ruler", 0.39, true),
                new Product("Copybook", 0.39,   false),
                new Product("Protractor", 0.39, false),
                new Product("Mechanical pencil", 0.39, true));

//        Set<Integer> cardNumbers = new HashSet<>();
//            cardNumbers.add(1233);
//            cardNumbers.add(2132);
//            cardNumbers.add(6544);
//            cardNumbers.add(9875);
//            cardNumbers.add(1598);

         Storage storage = new Storage(products.get(0), 5);

         CashCalculator cashCalculator = new CashCalculator(storage);

        System.out.println(cashCalculator.calculate());


    }
}
