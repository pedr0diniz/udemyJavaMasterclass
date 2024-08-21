package sec5expressionsstatementsandmore.sec550exercises;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {
//        int firstNumInt = (int) (firstNum * 1000);
//        int secondNumInt = (int) (secondNum * 1000);
//
//        double subtraction = firstNumInt - secondNumInt;
//
//        return (subtraction > -1 && subtraction < 1);

        return (int) (firstNum * 1000) == (int) (secondNum * 1000);
    }
}
