package sec9arrays.sec9118arrayspart1;

import java.util.Arrays;

public class ArraysPart1 {

    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        myIntArray[5] = 50;
        System.out.println(myIntArray); // prints object reference

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]); // 3.5

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("first = " + firstTen[0]); // first = 1
        System.out.println("length of array = " + firstTen.length); // length of array = 10
        System.out.println("last = " + firstTen[firstTen.length - 1]); // last = 10

        int[] newArray;
        newArray = new int[] {5, 4, 3, 2, 1};
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " "); // 5 4 3 2 1
        }
        System.out.println();

        int[] newerArray;
        newerArray = new int[5]; // no values assigned
        for (int i = 0; i < newerArray.length; i++) {
            System.out.print(newerArray[i] + " "); // 0 0 0 0 0
        }
        System.out.println();

        for (int i = 0; i < newerArray.length; i++) {
            newerArray[i] = newerArray.length - i; // assigning values
        }
        for (int i = 0; i < newerArray.length; i++) {
            System.out.print(newerArray[i] + " "); // 5 4 3 2 1
        }
        System.out.println();

        for (int element : newerArray) {
            System.out.print(element + " "); // 5 4 3 2 1
        }
        System.out.println();

        System.out.println(Arrays.toString(newerArray));
    }
}
