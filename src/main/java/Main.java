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
                new Product("Mechanical pencil Hatber", 0.39, true),
                new Product("Mechanical pencil Berlingo", 1),
                new Product("Mechanical pencil Parker", 2),
                new Product("Automatic pen Berlingo", 5),
                new Product("Automatic pen Hatber", 10));

//        Set<Integer> cardNumbers = new HashSet<>();
//            cardNumbers.add(1233);
//            cardNumbers.add(2132);
//            cardNumbers.add(6544);
//            cardNumbers.add(9875);
//            cardNumbers.add(1598);

         Check check = new Check(products.get(0), 5);
         Check check1 = new Check(products.get(10), 125, 1233);

         CashCalculator cashCalculator = new CashCalculator(check);
         CashCalculator cashCalculator1 = new CashCalculator(check1);

        System.out.println(cashCalculator.calculate());
        System.out.println(cashCalculator1.calculate());
      //  System.out.println(check.getProduct().isPromotion());
        System.out.println(check1.isDiscount(check1.getDiscountCardNumber()));


    }
}
