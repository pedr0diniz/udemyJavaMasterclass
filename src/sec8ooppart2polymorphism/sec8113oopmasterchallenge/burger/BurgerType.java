package sec8ooppart2polymorphism.sec8113oopmasterchallenge.burger;

public enum BurgerType {

    SINGLE_PATTY(4.00),
    DOUBLE_PATTY(6.00),
    CHICKEN_PATTY(3.00),
    DOUBLE_CHICKEN_PATTY(5.00),
    VEGAN_PATTY(4.50),
    DOUBLE_VEGAN_PATTY(6.50);

    private final double basePrice;

    BurgerType(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }
}
