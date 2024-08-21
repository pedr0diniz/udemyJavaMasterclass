package sec6controlflow.sec661theforstatementchallengeexercise;

public class ThePrimeNumberChallenge {

    public static void main(String[] args) {
        checkPrimes(500);
        checkPrimes(990);
    }

    public static void checkPrimes(int startOfRange) {
        int primeCounter = 0;
        for (int i = startOfRange; i <= 1000 && primeCounter < 3; i++) {
            if (isPrime(i)) {
                System.out.println("Number " + i + " is a prime number!");
                primeCounter++;
            }
        }
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
