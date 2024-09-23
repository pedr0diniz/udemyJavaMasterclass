package sec10listarraylistlinkedlistiteratorautoboxing.arraylists;

import java.util.*;

public class ArrayListChallengePart1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Welcome to the groceries list! What would you like to do?
                0 - Shutdown
                1 - Add Items
                2 - Remove Items
                """);
        String input = sc.nextLine();
        List<String> groceries = new ArrayList<>();

        while (!input.equals("0")) {
            if (input.equals("1")) {
                System.out.println("Please type the items you would like to INSERT, separated by ','");
                String items = sc.nextLine();
                List<String> itemsToAdd = Arrays.stream(items.split(",")).map(String::trim).toList();
                for (String item : itemsToAdd) {
                    if (!groceries.contains(item)) {
                        groceries.add(item);
                    }
                }
            } else if (input.equals("2")) {
                System.out.println("Please type the items you would like to REMOVE, separated by ','");
                List<String> itemsToRemove = Arrays.stream(sc.nextLine().split(",")).map(String::trim).toList();
                groceries.removeAll(itemsToRemove);
            }

            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
            System.out.println("Please, choose the next operation: ");
            input = sc.nextLine();
        }
    }
}
