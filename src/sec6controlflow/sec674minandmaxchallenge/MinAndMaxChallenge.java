package sec6controlflow.sec674minandmaxchallenge;

import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        double min = 0;
        double max = 0;
        boolean hasAtLeastOneValidNumber = false;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a valid number or any character to exit: ");
            String userInput = scanner.nextLine();
            try {
                double inputNumber = Double.parseDouble(userInput);
                if (!hasAtLeastOneValidNumber || inputNumber < min) {
                    min = inputNumber;
                }
                if (!hasAtLeastOneValidNumber || inputNumber > max) {
                    max = inputNumber;
                }
                hasAtLeastOneValidNumber = true;
            } catch (Exception e) {
                System.out.println("Non-numeric value entered. Quitting application.");
                break;
            }
        }

        if (hasAtLeastOneValidNumber) {
            System.out.println("Minimum value was: " + min + " and maximum value was: " + max);
        } else {
            System.out.println("No valid data entered");
        }
    }
}
