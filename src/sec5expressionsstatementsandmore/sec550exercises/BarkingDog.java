package sec5expressionsstatementsandmore.sec550exercises;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

//        if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
//            return true;
//        }

        // IntelliJ optimized the code above to be the code below
        return barking && (hourOfDay < 8 || hourOfDay > 22);
    }
}
