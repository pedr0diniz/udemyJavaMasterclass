package sec8ooppart2polymorphism.sec8113oopmasterchallenge.drink;

import sec8ooppart2polymorphism.sec8113oopmasterchallenge.ItemSize;
import sec8ooppart2polymorphism.sec8113oopmasterchallenge.Priceable;

public class Drink implements Priceable {
    private ItemSize size;
    private final DrinkType type;

    public Drink(ItemSize size, DrinkType type) {
        this.size = size;
        this.type = type;
    }

    public Drink(DrinkType type) {
        this(ItemSize.MEDIUM, type);
    }

    public void changeSize(ItemSize size) {
        this.size = size;
    }

    @Override
    public double getPrice() {
        return type.getBasePrice() * size.getPriceMultiplier();
    }

    @Override
    public void printItem() {
        System.out.printf(this.size.name() + " " + this.type.name() + " costs $%.2f%n", getPrice());
    }
}
