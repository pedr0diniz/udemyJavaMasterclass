package sec11abstractioninjava.sec11153abstractclasschallenge;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private ArrayList<ProductForSale> productsForSale;

    private OrderItem createOrderItem(int quantity, ProductForSale product) {
        return new OrderItem(quantity, product);
    }

    private void printOrderedItems(List<OrderItem> order) {
        String blankReceiptLine = getReceiptLine(' ');
        String underScoreReceiptLine = getReceiptLine('_');

        System.out.println("_".repeat(60));
        System.out.println(blankReceiptLine);
        System.out.printf("|%42s%s|%n", "List of Order Items - V1", " ".repeat(16));
        System.out.println(underScoreReceiptLine);
        System.out.println("| Amount |         Item         | Unit Price | Total Price |");
        System.out.println(blankReceiptLine);
        for (OrderItem item : order) {
            item.getProductForSale().printPricedItem(item.getQuantity());
        }
        System.out.println(underScoreReceiptLine);
    }

    public static void main(String[] args) {
        Store store = new Store();
        ProductForSale toothBrush = new ProductForSale("Tooth brush", 4.00, "Brushes your teeth");
        ProductForSale toothPaste = new ProductForSale("Tooth paste", 3.00, "Helps you brush your teeth");
        List<OrderItem> orderItems = new ArrayList<>();

        orderItems.add(store.createOrderItem(6, toothBrush));
        orderItems.add(store.createOrderItem(2, toothPaste));
        store.printOrderedItems(orderItems);
    }

    private static String getReceiptLine(char characterToRepeat) {
        return String.format("|%s|", String.valueOf(characterToRepeat).repeat(58));
    }
}
