package sec11abstractioninjava.sec11153abstractclasschallenge;

public class OrderItem {

    private int quantity;
    private ProductForSale productForSale;

    public OrderItem(int quantity, ProductForSale productForSale) {
        this.quantity = quantity;
        this.productForSale = productForSale;
    }

    public int getQuantity() {
        return quantity;
    }

    public ProductForSale getProductForSale() {
        return productForSale;
    }
}
