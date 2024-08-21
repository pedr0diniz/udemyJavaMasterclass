package sec8ooppart2polymorphism.sec8103compositionchallenge;

public class Refrigerator {

    private boolean hasWorkToDo;

    public Refrigerator() {

    }

    public void orderFood() {
        if (hasWorkToDo) System.out.println("Ordering food...");
        hasWorkToDo = false;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
