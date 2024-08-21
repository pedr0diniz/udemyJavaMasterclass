package sec8ooppart2polymorphism.sec8103compositionchallenge;

public class CompositionChallenge {
    public static void main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();

        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();

    }
}
