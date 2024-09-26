package sec10listarraylistlinkedlistiteratorautoboxing.sec10140linkedlistchallenge;

import java.util.*;

public class LinkedListChallenge {

    public static LinkedList<Place> towns = new LinkedList<>(
            List.of(
                    new Place("Sydney", 0),
                    new Place("Adelaide", 1374),
                    new Place("Alice Springs", 2771),
                    new Place("Brisbane", 917),
                    new Place("Darwin", 3972),
                    new Place("Melbourne", 877),
                    new Place("Perth", 3923)
            )
    );

    public static void main(String[] args) {
        towns.sort(Comparator.comparingInt(Place::distance));
        ListIterator<Place> listIterator = towns.listIterator();
        System.out.println(towns);
        Scanner sc = new Scanner(System.in);
        boolean forward = true;

        while(true) {
            printMenu();
            switch(sc.nextLine().toUpperCase()) {
                case "F", "FORWARD" -> {
                    if (!forward) listIterator.next();
                    if (listIterator.hasNext()) {
                        System.out.println(listIterator.next());
                        forward = true;
                    }
                }

                case "B", "BACKWARD" -> {
                    if (forward) listIterator.previous();
                    if (listIterator.hasPrevious()) {
                        System.out.println(listIterator.previous());
                        forward = false;
                    }
                }

                case "L", "LIST PLACES" -> System.out.println(towns);

                case "Q", "QUIT" -> {
                    return;
                }

                default -> {}
            }
        }
    }

    public static void printMenu() {
        System.out.println("""
                
                Available actions (select word or letter):
                (F)oward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit
                """);
    }

    public static void listPlaces(LinkedList<Place> towns, int cursor) {

        ListIterator<Place> listIterator = towns.listIterator(cursor);

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}
