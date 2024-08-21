package sec6controlflow.sec666digitsumchallenge;

public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("The sum of the digits in number 125 is " + digitSum(125));
        System.out.println("The sum of the digits in number -1 is " + digitSum(-1));
        System.out.println("The sum of the digits in number 1000 is " + digitSum(1000));
        System.out.println("The sum of the digits in number 123456 is " + digitSum(123456));
        System.out.println("The sum of the digits in number 4 is " + digitSum(4));
    }

    public static int digitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int digitSum = 0;
        while (number > 9) {
            digitSum += number % 10;
            number /= 10;
        }
        digitSum += number;

        return digitSum;
    }
}
