package sec8ooppart2polymorphism.sec8103compositionchallenge;

public class DishWasher {
    private boolean hasWorkToDo;

    public DishWasher() {

    }

    public void doDishes() {
        if (hasWorkToDo) System.out.println("Washing dishes...");
        hasWorkToDo = false;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
