package sec9arrays.sec9122arrayschallengeexercise;

import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {
    public static void main(String[] args) {
        int[] unsortedArray = getRandomArray(10);
        System.out.println(Arrays.toString(unsortedArray));
        Arrays.sort(unsortedArray);

        int[] sortedDescArray = new int[unsortedArray.length];

        for (int i = 0; i < unsortedArray.length / 2; i++) {
            int temp = unsortedArray[i];
            sortedDescArray[i] = unsortedArray[unsortedArray.length - 1 - i];
            sortedDescArray[unsortedArray.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(sortedDescArray));
    }

    private static int[] getRandomArray(int length) {
        Random random = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(100);
        }

        return arr;
    }
}
