package sec6controlflow.sec662sum3and5challengeandusingintellijsdebugger;

public class Sum3And5Challenge {

    public static void main(String[] args) {
        int countOfMatches = 0;
        int sumOfMatches = 0;
        for (int i = 1; countOfMatches < 5 && i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Number " + i + " is divisible by both 3 and 5");
                countOfMatches++;
                sumOfMatches += i;
            }
        }

        System.out.println("The sum of the first 5 matching numbers is: " + sumOfMatches);
    }
}
