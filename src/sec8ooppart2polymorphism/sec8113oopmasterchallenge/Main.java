package sec8ooppart2polymorphism.sec8113oopmasterchallenge;

import sec8ooppart2polymorphism.sec8113oopmasterchallenge.burger.BurgerTopping;
import sec8ooppart2polymorphism.sec8113oopmasterchallenge.burger.BurgerType;
import sec8ooppart2polymorphism.sec8113oopmasterchallenge.burger.DeluxeBurger;
import sec8ooppart2polymorphism.sec8113oopmasterchallenge.burger.RegularBurger;
import sec8ooppart2polymorphism.sec8113oopmasterchallenge.drink.Drink;
import sec8ooppart2polymorphism.sec8113oopmasterchallenge.drink.DrinkType;
import sec8ooppart2polymorphism.sec8113oopmasterchallenge.sideitem.SideItem;
import sec8ooppart2polymorphism.sec8113oopmasterchallenge.sideitem.SideItemType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MealOrder defaultOrder = new MealOrder();
        defaultOrder.printTotal();
        defaultOrder.printItemizedList();
        System.out.println();

        defaultOrder.addToppings(Arrays.asList(BurgerTopping.LETTUCE, BurgerTopping.TOMATO, BurgerTopping.PICKLES));
        defaultOrder.setDrinkSize(ItemSize.LARGE);
        defaultOrder.printTotal();
        defaultOrder.printItemizedList();
        System.out.println();

        MealOrder largeMeal = new MealOrder(
                RegularBurger.create(BurgerType.DOUBLE_PATTY, Arrays.asList(BurgerTopping.EXTRA_CHEESE, BurgerTopping.BACON, BurgerTopping.CARAMELIZED_ONIONS)),
                new Drink(ItemSize.LARGE, DrinkType.MILKSHAKE),
                new SideItem(SideItemType.ONION_RINGS, ItemSize.LARGE)
        );
        largeMeal.addToppings(List.of(BurgerTopping.PICKLES));
        largeMeal.printTotal();
        largeMeal.printItemizedList();
        System.out.println();

        MealOrder largeDeluxeMeal = new MealOrder(
                DeluxeBurger.create(BurgerType.DOUBLE_PATTY,
                        new ArrayList<>(Arrays.asList(
                                BurgerTopping.EXTRA_CHEESE,
                                BurgerTopping.BACON,
                                BurgerTopping.CARAMELIZED_ONIONS)
                )),
                new Drink(ItemSize.LARGE, DrinkType.MILKSHAKE),
                new SideItem(SideItemType.ONION_RINGS, ItemSize.LARGE)
        );
        largeDeluxeMeal.addToppings(Arrays.asList(BurgerTopping.PICKLES, BurgerTopping.LETTUCE));
        largeDeluxeMeal.printTotal();
        largeDeluxeMeal.printItemizedList();
        System.out.println();
    }
}
