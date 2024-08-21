package sec7ooppart1inheritance.sec796thetextblockandotherformattingoptions;

public class Main {

    public static void main(String[] args) {
        String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point";

        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List:
                    \u2022 First Point
                        \u2022 Sub Point""";

        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d%n", age);

        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);

        System.out.printf("Your age is %.2f%n", (float) age); // Your age is 35.00

        for (int i = 1; i <= 100000; i *= 10) {
            // Printing      1
            // Printing     10
            // Printing    100
            // Printing   1000
            // Printing  10000
            // Printing 100000
            System.out.printf("Printing %6d %n", i);
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);
        String formattedString2 = "Your age is %d".formatted(age);
        System.out.println(formattedString2);
    }
}
