package sec10listarraylistlinkedlistiteratorautoboxing.sec10142introductiontoautoboxingandunboxing;

import java.util.ArrayList;
import java.util.Arrays;

public class Autoboxing {

    public static void main(String[] args) {

        Integer boxedInt = Integer.valueOf(15);
//        Integer deprecatedBoxing = new Integer(15);
        int unboxedInt = boxedInt.intValue();

        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());

        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDoubleObject();

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));

        System.out.println(wrapperArray[0].getClass().getName());

        Character[] characterArray = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(characterArray));

        var ourList = getListWithInts(1, 2, 3, 4, 5);
        System.out.println(ourList);

        var ourList2 = getListWithIntegers(1, 2, 3, 4, 5);
        System.out.println(ourList2);
    }

    private static ArrayList<Integer> getListWithInts(int... varargs) {
        ArrayList<Integer> aList = new ArrayList<>();
        for (Integer i : varargs) {
            aList.add(i);
        }

        return aList;
    }

    private static ArrayList<Integer> getListWithIntegers(Integer... varargs) {
        ArrayList<Integer> aList = new ArrayList<>();
        for (int i : varargs) {
            aList.add(i);
        }

        return aList;
    }

    private static int returnAnInt(Integer i) {
        return i;
    }

    private static Integer returnAnInteger(int i) {
        return i;
    }

    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive() {
        return 100.00;
    }
}
