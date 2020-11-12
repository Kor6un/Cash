public class Card extends Entity {

    private int id;

    private int number;

    public Card(String name, int id, int number) {
        super(name);
        this.id = id;
        this.number = number;
    }

    @Override
    public String toString() {

        return "id: " + id + "; Discount card: " + number;
    }
}
