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

//        for (Product p : products) {
//            System.out.println(p);
//        }

        Set<Integer> cardNumbers = new HashSet<>();
        cardNumbers.add(1233);
        cardNumbers.add(2132);
        cardNumbers.add(6544);
        cardNumbers.add(9875);
        cardNumbers.add(1598);

 //       System.out.println(cardNumbers);

        Storage storage = new Storage(products.get(0), 28,false);
        Storage storage1 = new Storage(products.get(0), 28,true);
        System.out.println(storage + "\n" + storage1);

    }
}
