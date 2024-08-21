package sec6controlflow.sec660theforstatement;

public class TheForLoop {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }

        for (double rate = 2.0; rate <= 5.0; rate++) {
            System.out.println("$10,000 at " + rate + "% interest = $" + calculateInterest(10000.0, rate));
        }

        for (double i = 7.5; i <= 10.0; i += 0.25) {
            if (i > 8.5) {
                break;
            }
            System.out.println("$100 at " + i + "% interest = $" + calculateInterest(100.0, i));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
