package sec11abstractioninjava.sec11153abstractclasschallenge;

public class ProductForSale {
    private final String type;
    private final double price;
    private final String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity) {
        return this.price * quantity;
    }

    public void printPricedItem(int quantity) {
        System.out.printf("| %6d | %-20s | $%-9.2f | $%-10.2f |%n", quantity, type, price, getSalesPrice(quantity));
    }
}
