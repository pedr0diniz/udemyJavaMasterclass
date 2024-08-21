package sec6controlflow.sec665thewhileloopchallengeexercise;

public class WhileLoopChallenge {
    public static void main(String[] args) {
        int numberToCheck = 5;
        int evenCounter = 0;
        int oddCounter = 0;
        while (numberToCheck <= 20 && evenCounter < 5) {
            if (isEvenNumber(numberToCheck)) {
                System.out.println(numberToCheck + " is even");
                evenCounter++;
            } else {
                oddCounter++;
            }
            numberToCheck++;
        }
        System.out.println("Out of the given numbers, " + oddCounter + " are odd and " + evenCounter + " are even");
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
