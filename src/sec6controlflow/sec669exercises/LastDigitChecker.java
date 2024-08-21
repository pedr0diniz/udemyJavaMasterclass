package sec6controlflow.sec669exercises;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) return false;

        int num1LastDigit = num1 % 10;
        int num2LastDigit = num2 % 10;
        int num3LastDigit = num3 % 10;

        return (num1LastDigit == num2LastDigit) || (num1LastDigit == num3LastDigit) || (num2LastDigit == num3LastDigit);
    }

    public static boolean isValid(int number) {
        return (number > 9 && number < 1001);
    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(62, 882, 772));
    }
}
