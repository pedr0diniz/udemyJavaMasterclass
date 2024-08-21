package sec8ooppart2polymorphism.sec8103compositionchallenge;

public class SmartKitchen {

    private Refrigerator refrigerator;
    private DishWasher dishWasher;
    private CoffeeMaker coffeeMaker;

    public SmartKitchen() {
        this.refrigerator = new Refrigerator();
        this.dishWasher = new DishWasher();
        this.coffeeMaker = new CoffeeMaker();
    }

    public SmartKitchen(Refrigerator refrigerator, DishWasher dishWasher, CoffeeMaker coffeeMaker) {
        this.refrigerator = refrigerator;
        this.dishWasher = dishWasher;
        this.coffeeMaker = coffeeMaker;
    }

    public void addWater() {
        this.coffeeMaker.setHasWorkToDo(true);
    }

    public void pourMilk() {
        this.refrigerator.setHasWorkToDo(true);
    }

    public void loadDishWasher() {
        this.dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(
            boolean coffeeMakerHasWorkToDo,
            boolean refrigeratorHasWorkToDo,
            boolean dishWasherHasWorkToDo
    ) {
        this.coffeeMaker.setHasWorkToDo(coffeeMakerHasWorkToDo);
        this.refrigerator.setHasWorkToDo(refrigeratorHasWorkToDo);
        this.dishWasher.setHasWorkToDo(dishWasherHasWorkToDo);
    }

    public void doKitchenWork() {
        this.coffeeMaker.brewCoffee();
        this.refrigerator.orderFood();
        this.dishWasher.doDishes();
    }
}
