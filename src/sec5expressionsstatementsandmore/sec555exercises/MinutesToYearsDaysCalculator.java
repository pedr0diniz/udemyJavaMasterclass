package sec5expressionsstatementsandmore.sec555exercises;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long years = minutes / 525600;
        long remainingMinutes = minutes % 525600;

        System.out.println(minutes + " min = " + years + " y and " + (remainingMinutes / 1440) + " d");
    }
}
