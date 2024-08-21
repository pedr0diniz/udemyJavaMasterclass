package sec8ooppart2polymorphism.sec8103compositionchallenge;

public class CoffeeMaker {
    private boolean hasWorkToDo;

    public CoffeeMaker() {

    }

    public void brewCoffee() {
        if (hasWorkToDo) System.out.println("Brewing coffee...");
        hasWorkToDo = false;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
