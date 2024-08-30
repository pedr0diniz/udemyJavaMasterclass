package sec8ooppart2polymorphism.sec8113oopmasterchallenge.burger;

import java.util.ArrayList;
import java.util.List;

public class RegularBurger extends Burger {

    private RegularBurger(BurgerType burgerType, List<BurgerTopping> burgerToppings) {
        super(burgerType, burgerToppings);
    }

    private RegularBurger(BurgerType burgerType) {
        super(burgerType, new ArrayList<>());
    }

    @Override
    public void addToppings(List<BurgerTopping> toppings) {
        int currentAmountOfToppings = this.getBurgerToppings().size();
        if ((toppings.size() < 4) && (currentAmountOfToppings < 4) && (currentAmountOfToppings + toppings.size() < 4)) {
            super.addToppings(toppings);
        } else {
            System.out.println("Could not add toppings");
        }
    }


    public static RegularBurger create(BurgerType type) {
        return new RegularBurger(type);
    }

    public static RegularBurger create(BurgerType type, List<BurgerTopping> toppings) {
        // validate toppings here
        if (toppings != null && !toppings.isEmpty() && toppings.size() < 4) {
            return new RegularBurger(type, toppings);
        }

        throw new RuntimeException("Could not validate toppings! Either they are null, empty or bigger than 3");
    }
}
