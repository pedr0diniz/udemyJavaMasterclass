package sec9arrays.sec9126minimumelementchallenge;

import java.util.Scanner;

public class MinimumElementChallenge {

    public static void main(String[] args) {
        System.out.println(findMin(readIntegers()));
    }

    private static int[] readIntegers() {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(",");

        int[] integers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            integers[i] = Integer.parseInt(input[i].trim());
        }

        return integers;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }

        return min;
    }
}
