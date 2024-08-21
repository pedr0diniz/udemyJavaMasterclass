package sec6controlflow.sec669exercises;

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        } else if (number == 0) {
            System.out.println("Zero");
        }

        int reverseNumber = reverse(number);
        int whileVar = reverseNumber;

        while (whileVar > 0) {
            int lastDigit = whileVar % 10;

            String lastDigitString = switch (lastDigit) {
                case 1 -> "One";
                case 2 -> "Two";
                case 3 -> "Three";
                case 4 -> "Four";
                case 5 -> "Five";
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8 -> "Eight";
                case 9 -> "Nine";
                default -> "Zero";
            };

            System.out.println(lastDigitString);
            whileVar /= 10;
        }

        int originalDigitCount = getDigitCount(number);
        int reverseDigitCount = getDigitCount(reverseNumber);

        for (int i = reverseDigitCount; i < originalDigitCount; i++) {
            System.out.println("Zero");
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = (reverse * 10) + (number % 10);
            number /= 10;
        }

        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;

        int digits = 1;
        while (number > 9) {
            number /= 10;
            digits++;
        }

        return digits;
    }
}
