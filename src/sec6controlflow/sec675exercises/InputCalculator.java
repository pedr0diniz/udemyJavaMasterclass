package sec6controlflow.sec675exercises;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        int counter = 0;
        int sum = 0;
        long average = 0L;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = scanner.nextLine();
            try {
                int inputNumber = Integer.parseInt(userInput);
                sum += inputNumber;
                counter++;
            } catch (Exception e) {
                break;
            }
        }

        if (counter > 0) {
            average = Math.round(((double) sum / counter));
        }

        System.out.println("SUM = " + sum + " AVG = " + average);
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}