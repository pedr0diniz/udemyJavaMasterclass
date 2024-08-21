package sec6controlflow.sec669exercises;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false;

        int divisorSum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                divisorSum += i;
            }
        }

        return divisorSum == number;
    }
}
