package sec8ooppart2polymorphism.sec8113oopmasterchallenge.sideitem;

import sec8ooppart2polymorphism.sec8113oopmasterchallenge.ItemSize;
import sec8ooppart2polymorphism.sec8113oopmasterchallenge.Priceable;

public class SideItem implements Priceable {
    private final SideItemType type;
    private final ItemSize size;

    public SideItem(SideItemType type, ItemSize size) {
        this.type = type;
        this.size = size;
    }

    public SideItem(SideItemType type) {
        this(type, ItemSize.MEDIUM);
    }

    @Override
    public double getPrice() {
        return type.getPrice() * size.getPriceMultiplier();
    }

    @Override
    public void printItem() {
        System.out.printf(this.size.name() + " " + this.type.name() + " costs $%.2f%n", getPrice());
    }
}
