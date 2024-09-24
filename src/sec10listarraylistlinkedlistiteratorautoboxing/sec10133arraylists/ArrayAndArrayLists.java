package sec10listarraylistlinkedlistiteratorautoboxing.sec10133arraylists;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayAndArrayLists {

    public static void main(String[] args) {
        String[] originalArray = new String[] {"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0, "one");
        System.out.println("list: " + originalList);
        System.out.println("array: " + Arrays.toString(originalArray));

//        originalList.add("zero");

        originalList.sort(Comparator.naturalOrder());
        System.out.println("array: " + Arrays.toString(originalArray));
    }
}
