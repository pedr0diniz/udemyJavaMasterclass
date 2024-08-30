package sec8ooppart2polymorphism.sec8113oopmasterchallenge.burger;

import java.util.ArrayList;
import java.util.List;

public class DeluxeBurger extends Burger {
    private DeluxeBurger(BurgerType burgerType, List<BurgerTopping> burgerToppings) {
        super(burgerType, burgerToppings);
    }

    private DeluxeBurger(BurgerType burgerType) {
        super(burgerType, new ArrayList<>());
    }

    @Override
    public void addToppings(List<BurgerTopping> toppings) {
        int currentAmountOfToppings = this.getBurgerToppings().size();
        if ((toppings.size() < 6) && (currentAmountOfToppings < 4) && (currentAmountOfToppings + toppings.size() < 6)) {
            super.addToppings(toppings);
        } else {
            System.out.println("Could not add toppings");
        }
    }

    @Override
    public double getPrice() {
        return 7.00;
    }

    public static DeluxeBurger create(BurgerType type) {
        return new DeluxeBurger(type);
    }

    public static DeluxeBurger create(BurgerType type, List<BurgerTopping> toppings) {
        // validate toppings here
        if (toppings != null && !toppings.isEmpty() && toppings.size() < 6) {
            return new DeluxeBurger(type, toppings);
        }

        throw new RuntimeException("Could not validate toppings! Either they are null, empty or bigger than 5");
    }
}
