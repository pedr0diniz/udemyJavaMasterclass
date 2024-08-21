package sec6controlflow.sec673readinguserinputchallenge;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int validNumberCount = 0;
        double sum = 0;

        while (validNumberCount < 5) {
            System.out.println("Enter number #" + (validNumberCount + 1) + ": ");
            String userInput = scanner.nextLine();

            try {
//                int inputNumber = Integer.parseInt(userInput);
                double inputNumber = Double.parseDouble(userInput);
                sum+= inputNumber;
                validNumberCount++;
            } catch (Exception e) {
                System.out.println("Invalid number");
            }
        }

        System.out.println("The sum of the 5 given valid numbers is: " + sum);
    }
}
