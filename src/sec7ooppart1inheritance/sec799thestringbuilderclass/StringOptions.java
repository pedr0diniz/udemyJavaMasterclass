package sec7ooppart1inheritance.sec799thestringbuilderclass;

public class StringOptions {
    public static void main(String[] args) {
        String helloWorld = "Hello" + "World";
        helloWorld.concat(" and Goodbye"); // Returns a new object
//        StringBuilder helloWorldBuilder = "Hello" + "World"; // does not compile

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + "World");
        helloWorldBuilder.append(" and Goodbye"); // Returns a reference to the same object

        printInformation(helloWorld); // Hello World
                                        // The .concat() statement result was not assigned to a variable

        printInformation(helloWorldBuilder); // Hello World and Goodbye

        StringBuilder emptyStart = new StringBuilder(); // default capacity of 16 chars
        emptyStart.append("a".repeat(17)); // moves the value in memory to a StringBuilder of size * 2 (34)

        StringBuilder emptyStart32 = new StringBuilder(32); // initializes the builder with 32 characters
        emptyStart32.append("a".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" and Goodbye");
        builderPlus.deleteCharAt(16).insert(16, 'g');
        System.out.println(builderPlus);

        builderPlus.replace(16, 17, "G");
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
    }

    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("String length = " + string.length());
    }

    public static void printInformation(StringBuilder builder) {
        System.out.println("StringBuilder = " + builder);
        System.out.println("StringBuilder length = " + builder.length());
        System.out.println("StringBuilder capacity = " + builder.capacity());
    }
}
