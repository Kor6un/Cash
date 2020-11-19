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
                new Product("Automatic pen Hatber", 10, true));

        List<Cash> cashList = Arrays.asList(
                new Cash(products.get(0), 4),
                new Cash(products.get(0), 5),
                new Cash(products.get(0), 4, 1234),
                new Cash(products.get(0), 5, 1234),
                new Cash(products.get(1), 4),
                new Cash(products.get(1), 5),
                new Cash(products.get(1), 4, 1234),
                new Cash(products.get(1), 5, 1234));

        for (Cash c : cashList) {
            System.out.println(c);
        }

    }
}
