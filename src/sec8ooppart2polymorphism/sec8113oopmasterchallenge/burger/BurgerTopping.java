package sec8ooppart2polymorphism.sec8113oopmasterchallenge.burger;

public enum BurgerTopping {

    PICKLES(0.50),
    BACON(1.00),
    EXTRA_CHEESE(0.75),
    LETTUCE(0.50),
    TOMATO(0.50),
    CARAMELIZED_ONIONS(0.75);

    private final double price;

    BurgerTopping(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
