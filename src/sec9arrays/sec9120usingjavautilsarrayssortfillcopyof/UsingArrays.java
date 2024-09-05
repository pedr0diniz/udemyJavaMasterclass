package sec9arrays.sec9120usingjavautilsarrayssortfillcopyof;

import java.util.Arrays;
import java.util.Random;

public class UsingArrays {
    public static void main(String[] args) {
        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray)); // random array

        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray)); // random array, but sorted ascending

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray)); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray)); // [5, 5, 5, 5, 5, 5, 5, 5, 5, 5]

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray)); // random array

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray)); // random array equal to thirdArray

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray)); // random array equal to thirdArray
        System.out.println(Arrays.toString(fourthArray)); // sorted thirdArray

        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray)); // first 5 elements of thirdArray

        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray)); // thirdArray and its 10 elements + 0, 0, 0, 0, 0

        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray)); // [Able, David, Jane, Mark, Ralph]
        if (Arrays.binarySearch(sArray, "Mark") >= 0) {
            System.out.println("Found Mark in the list");
        }

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5};
        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];

        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }
}
