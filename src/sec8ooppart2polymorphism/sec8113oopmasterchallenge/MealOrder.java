package sec8ooppart2polymorphism.sec8113oopmasterchallenge;

import sec8ooppart2polymorphism.sec8113oopmasterchallenge.burger.Burger;
import sec8ooppart2polymorphism.sec8113oopmasterchallenge.burger.BurgerTopping;
import sec8ooppart2polymorphism.sec8113oopmasterchallenge.burger.BurgerType;
import sec8ooppart2polymorphism.sec8113oopmasterchallenge.burger.RegularBurger;
import sec8ooppart2polymorphism.sec8113oopmasterchallenge.drink.Drink;
import sec8ooppart2polymorphism.sec8113oopmasterchallenge.drink.DrinkType;
import sec8ooppart2polymorphism.sec8113oopmasterchallenge.sideitem.SideItem;
import sec8ooppart2polymorphism.sec8113oopmasterchallenge.sideitem.SideItemType;

import java.util.List;

public class MealOrder {
    private final Burger burger;
    private final Drink drink;
    private final SideItem sideItem;

    public MealOrder(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public MealOrder() {
        this(RegularBurger.create(BurgerType.SINGLE_PATTY), new Drink(DrinkType.SODA), new SideItem(SideItemType.FRIES));
    }

    public void addToppings(List<BurgerTopping> toppings) {
        this.burger.addToppings(toppings);
    }

    public void setDrinkSize(ItemSize size) {
        this.drink.changeSize(size);
    }

    public void printItemizedList() {
        this.burger.printItem();
        this.drink.printItem();
        this.sideItem.printItem();
    }

    public void printTotal() {
        double totalPrice = this.burger.getPrice() + this.drink.getPrice() + this.sideItem.getPrice();
        System.out.printf("The total price of all items combined is: $%.2f%n", totalPrice);
    }

    public Burger getBurger() {
        return burger;
    }

    public Drink getDrink() {
        return drink;
    }

    public SideItem getSideItem() {
        return sideItem;
    }
}
