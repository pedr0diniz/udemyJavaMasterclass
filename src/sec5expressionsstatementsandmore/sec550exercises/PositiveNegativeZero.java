package sec5expressionsstatementsandmore.sec550exercises;

public class PositiveNegativeZero {
    public static void checkNumber(int number) {
        String result = "zero";
        if (number > 0) {
            result = "positive";
        } else if (number < 0) {
            result = "negative";
        }

        System.out.println(result);
    }
}