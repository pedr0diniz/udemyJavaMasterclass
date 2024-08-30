package sec8ooppart2polymorphism.sec8113oopmasterchallenge.sideitem;

public enum SideItemType {

    FRIES(2.50),
    ONION_RINGS(3.00),
    SALAD(3.00);


    private final double price;

    SideItemType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
