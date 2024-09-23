package sec10listarraylistlinkedlistiteratorautoboxing.arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {

    public static void main(String[] args) {
        String[] items = {"apples", "bananas", "milk", "eggs"}; // create a populated array

        List<String> list = List.of(items); // creates an immutable list
        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list); // takes the immutable list elements and creates an arraylist
        groceries.add("yogurt");

        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(List.of("pickles", "mustard", "cheese")); // create & populate
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        ArrayList<String> anotherList = new ArrayList<>(List.of("wine", "beer"));

        groceries.addAll(5, anotherList); // inserts sublist an index

        System.out.println(groceries);

        System.out.println("Third item: " + groceries.get(2)); // gets item by index

        if (groceries.contains("mustard")) { // checks if list contains element
            System.out.println("List contains mustard");
        }

        groceries.add("yogurt");

        System.out.println("First index of yogurt = " + groceries.indexOf("yogurt"));
        System.out.println("Last index of yogurt = " + groceries.lastIndexOf("yogurt"));

        groceries.remove(1); // removes at index
        System.out.println(groceries);

        groceries.remove("yogurt"); // removes first occurrence in list
        System.out.println(groceries);

        groceries.add(3, "yogurt");
        System.out.println(groceries);

        groceries.removeAll(List.of("yogurt")); // removes all occurrences of all items in parameter list
        System.out.println(groceries);

        groceries.retainAll(List.of("apples", "milk", "mustard", "cheese", "yogurt")); // removes all items that are not in both lists (INTERSECTION)
        System.out.println(groceries);

        groceries.clear();
        System.out.println("List is empty? " + groceries.isEmpty());

        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));
        System.out.println(groceries);

        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        String[] groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));
    }
}
