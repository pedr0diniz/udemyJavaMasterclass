package sec6controlflow.sec669exercises;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;
        if (number < 10) return number * 2;

        int lastDigit = number % 10;
        while (number > 9) {
            number /= 10;
        }
        return lastDigit + number;
    }
}
