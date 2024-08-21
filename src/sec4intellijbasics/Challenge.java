package sec4intellijbasics;

public class Challenge {
    public static void main(String[] args) {
        double firstValue = 20.00;
        double secondValue = 80.00;
        double sum = (firstValue + secondValue) * 100.00;
        double remainder = sum % 40.00;
        boolean hasNoRemainder = remainder == 0.00;
        System.out.println("The division has a remainder: " + hasNoRemainder);
        if (!hasNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
