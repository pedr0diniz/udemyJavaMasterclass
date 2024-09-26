package sec10listarraylistlinkedlistiteratorautoboxing.sec10146introductiontotheenumtype;

import java.util.Random;

public class EnumProject {
    public static void main(String[] args) {
        DaysOfTheWeek weekDay = DaysOfTheWeek.TUESDAY;
        System.out.println(weekDay);

        System.out.printf("Name is %s, Ordinal Value = %d%n", weekDay.name(), weekDay.ordinal());

        for (int i = 0; i < 10; i++) {
            weekDay = getRandomDay();

//            System.out.printf("Name is %s, Ordinal Value = %d%n", weekDay.name(), weekDay.ordinal());
//
//            if (weekDay == DaysOfTheWeek.FRIDAY) {
//                System.out.println("Found a friday!");
//            }

            switchDayOfTheWeek(weekDay);
        }

        for (Topping topping : Topping.values()) {
            System.out.println(topping.name() + ": " + topping.getPrice());
        }
    }

    public static void switchDayOfTheWeek(DaysOfTheWeek weekDay) {

        int weekDayInteger = weekDay.ordinal() + 1;
        switch (weekDay) {
            case WEDNESDAY -> System.out.println("Wednesday is Day " + weekDayInteger);
            case SATURDAY -> System.out.println("Saturday is Day " + weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0) + weekDay.name().substring(1).toLowerCase() + " is Day " + weekDayInteger);
        }
    }

    public static DaysOfTheWeek getRandomDay() {

        int randomInteger = new Random().nextInt(7);
        DaysOfTheWeek[] allDays = DaysOfTheWeek.values();

        return allDays[randomInteger];
    }
}
