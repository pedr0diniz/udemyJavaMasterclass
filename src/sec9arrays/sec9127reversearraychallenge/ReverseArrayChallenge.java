package sec9arrays.sec9127reversearraychallenge;

import java.util.Arrays;

public class ReverseArrayChallenge {

    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(reverseCopy(arr)));

        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    private static int[] reverseCopy(int[] array) {
        int[] reverseCopy = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reverseCopy[i] = array[array.length - i - 1];
        }

        return reverseCopy;
    }
}
