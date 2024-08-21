package sec7ooppart1inheritance.sec797anotherlookatthestring;

public class AllAboutStrings {
    public static void main(String[] args) {
        printInformation("Hello World");
        printInformation("");
        printInformation("\t     \n");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));
        System.out.printf("index of l = %d %n", helloWorld.indexOf('l')); // first l
        System.out.printf("last index of l = %d %n", helloWorld.lastIndexOf('l')); // last l

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l', 3)); // second l
        System.out.printf("last index of l = %d %n", helloWorld.lastIndexOf('l', 8)); // second last l

        String helloWorldLower = helloWorld.toLowerCase();
        if (helloWorld.equals(helloWorldLower)) {
            System.out.println("Values match exactly");
        }
        if (helloWorld.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("Values match ignoring case");
        }
        if (helloWorld.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }
        if (helloWorld.endsWith("World")) {
            System.out.println("String ends with World");
        }
        if (helloWorld.contains("World")) {
            System.out.println("String contains World");
        }
        if (helloWorld.contentEquals("Hello World")) {
            System.out.println("Values match exactly");
        }
    }

    public static void printInformation(String string) {
        int length = string.length();

        if (string.isEmpty()) {
            System.out.println("String is empty");
            return;
        }

        if (string.isBlank()) {
            System.out.println("System is blank");
            return;
        }

        System.out.printf("Length = %d %n", length);
        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }
}
