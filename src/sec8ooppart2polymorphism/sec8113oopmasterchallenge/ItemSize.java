package sec8ooppart2polymorphism.sec8113oopmasterchallenge;

public enum ItemSize {
    SMALL(0.9),
    MEDIUM(1.0),
    LARGE(1.1);

    private final double priceMultiplier;

    ItemSize(double priceMultiplier) {
        this.priceMultiplier = priceMultiplier;
    }

    public double getPriceMultiplier() {
        return priceMultiplier;
    }
}
