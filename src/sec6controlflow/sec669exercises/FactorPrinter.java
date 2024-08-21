package sec6controlflow.sec669exercises;

public class FactorPrinter {
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }

        System.out.println(1);
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }

        if (number > 1) {
            System.out.println(number);
        }
    }
}
