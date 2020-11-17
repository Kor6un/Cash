public class Storage {
    private Product product;
    private int quantity;
    private boolean promotion;

    public Storage(Product product, int quantity, boolean promotion) {
        this.product = product;
        this.quantity = quantity;
        this.promotion = promotion;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isPromotion() {
        return promotion;
    }

    public void setPromotion(boolean promotion) {
        this.promotion = promotion;
    }

    @Override
    public String toString(){
        if (promotion == true) {
            return product.toString() + "(акционный товар)";
        }
        return product.toString();
    }
}
