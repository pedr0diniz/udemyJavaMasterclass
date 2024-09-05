package sec9arrays.sec9127reversearraychallenge;

import java.util.Arrays;

public class ReverseArray {

    private static void reverse(int[] arr) {
        System.out.println("Array = " + Arrays.toString(arr));

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        System.out.println("Reversed array = " + Arrays.toString(arr));
    }
}
