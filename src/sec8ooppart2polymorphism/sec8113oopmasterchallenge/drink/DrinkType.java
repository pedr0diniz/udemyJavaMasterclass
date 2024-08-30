package sec8ooppart2polymorphism.sec8113oopmasterchallenge.drink;

public enum DrinkType {
    SODA(1.50),
    JUICE(2.00),
    WATER(1.00),
    MILKSHAKE(3.00);

    private final double basePrice;

    DrinkType(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }
}
