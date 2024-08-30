package sec8ooppart2polymorphism.sec8113oopmasterchallenge.burger;

import sec8ooppart2polymorphism.sec8113oopmasterchallenge.Priceable;

import java.util.List;

public abstract class Burger implements Priceable {
    private final BurgerType burgerType;
    private final List<BurgerTopping> burgerToppings;

    public Burger(BurgerType burgerType, List<BurgerTopping> burgerToppings) {
        this.burgerType = burgerType;
        this.burgerToppings = burgerToppings;
    }

    public BurgerType getBurgerType() {
        return burgerType;
    }

    public List<BurgerTopping> getBurgerToppings() {
        return burgerToppings;
    }

    public void addToppings(List<BurgerTopping> toppings) {
        this.burgerToppings.addAll(toppings);
    }

    @Override
    public double getPrice() {
        double toppingsTotalPrice = 0.0;
        for (BurgerTopping topping : burgerToppings) {
            toppingsTotalPrice += topping.getPrice();
        }

        return burgerType.getBasePrice() + toppingsTotalPrice;
    }

    @Override
    public void printItem() {
        System.out.printf(
                this.burgerType.name() + " " + this.getClass().getSimpleName() +
                        " with " + burgerToppings.toString() + " extra toppings costs $%.2f%n", getPrice()
        );
    }
}
