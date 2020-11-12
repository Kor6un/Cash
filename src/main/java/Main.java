import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<Entity> products = Arrays.asList(
                new Product("Pen", 0, 0.39, false),
                new Product("Clip", 1, 0.39, true),
                new Product("Pencil", 2, 1.98, false),
                new Product("Ruler", 3, 0.39, true),
                new Product("Copybook", 4, 0.39, false),
                new Product("Protractor", 5, 0.39, false),
                new Product("Mechanical pencil", 6, 0.39, true));

        for (Entity p : products) {
            System.out.println(p);
        }

        List<Entity> cards = Arrays.asList(
                new Card("Discount card", 0, 2134),
                new Card("Discount card", 1, 1234),
                new Card("Discount card", 2, 7895),
                new Card("Discount card", 3, 6542));

        for (Entity e : cards) {
            System.out.println(e);
        }
    }
}
