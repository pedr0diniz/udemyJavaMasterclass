package sec6controlflow.sec669exercises;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) return -1;

        int evenSum = 0;
        while (number > 0) {
            int currentDigit = number % 10;
            if (currentDigit % 2 == 0) {
                evenSum += currentDigit;
            }
            number /= 10;
        }

        return evenSum;
    }
}
