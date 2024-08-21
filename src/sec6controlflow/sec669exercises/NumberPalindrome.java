package sec6controlflow.sec669exercises;

public class NumberPalindrome {
//    public static boolean isPalindrome(int number) {
//        int unsignedNumber = (number < 0) ? (number * -1) : number;
//
//        String reverse = "";
//        while (unsignedNumber > 0) {
//            reverse += unsignedNumber % 10;
//            unsignedNumber /= 10;
//        }
//
//        return (Integer.parseInt(reverse) == unsignedNumber);
//    }
    public static boolean isPalindrome(int number) {
        int originalNumber = (number < 0) ? (number * -1) : number;
        int unsignedNumber = originalNumber;

        int reverse = 0;
        while (unsignedNumber > 0) {
            reverse = (reverse * 10) + (unsignedNumber % 10);
            unsignedNumber /= 10;
        }

        return reverse == originalNumber;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(11));
    }
}
