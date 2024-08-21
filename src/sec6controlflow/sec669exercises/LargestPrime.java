package sec6controlflow.sec669exercises;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(2));
        System.out.println(getLargestPrime(3));
        System.out.println(getLargestPrime(5));
        System.out.println(getLargestPrime(7));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(9));
    }

//    public static boolean isPrime(int number) {
//        for (int i = 2; i < number; i++) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//    public static int getLargestPrime(int number) {
//        int largestPrimeFactor = -1;
//        for (int i = 2; i <= number; i++) {
//            if (isPrime(i) && number % i == 0) {
//                largestPrimeFactor = i;
//            }
//        }
//
//        return largestPrimeFactor;
//    }

    public static int getLargestPrime(int number) {
        if (number < 2) return -1;

        int largestPrimeFactor = -1;

        for (int currentNumber = 2; currentNumber <= number; currentNumber++) {
            boolean isPrime = true;
            for (int primeChecker = 2; primeChecker <= currentNumber; primeChecker++) {
                if (currentNumber % primeChecker == 0 && currentNumber != primeChecker) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime && number % currentNumber == 0) {
                largestPrimeFactor = currentNumber;
            }
        }

        return largestPrimeFactor;
    }
}
