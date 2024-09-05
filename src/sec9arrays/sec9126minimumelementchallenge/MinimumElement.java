package sec9arrays.sec9126minimumelementchallenge;

import java.util.Scanner;

public class MinimumElement {

    private static int readInteger() {
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }

    private static int[] readElements(int size) {
        Scanner sc = new Scanner(System.in);

        int[] elements = new int[size];
        for (int i = 0; i < size; i++) {
            elements[i] = sc.nextInt();
        }

        return elements;
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