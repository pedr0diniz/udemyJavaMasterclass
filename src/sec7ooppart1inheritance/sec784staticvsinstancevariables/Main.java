package sec7ooppart1inheritance.sec784staticvsinstancevariables;

public class Main {
    public static void main(String[] args) {
        Dog rex = new Dog("rex");
        Dog fluffy = new Dog("fluffy");
        rex.printName(); // fluffy
        fluffy.printName(); // fluffy

        Dog2 rex2 = new Dog2("rex");
        Dog2 fluffy2 = new Dog2("fluffy");
        rex2.printName(); // rex
        fluffy2.printName(); // fluffy
    }
}

class Dog {
    private static String name;

    public Dog(String name) {
        Dog.name = name;
    }

    public void printName() {
        System.out.println("name = " + name);
    }
}

class Dog2 {
    private String name;

    public Dog2(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("name = " + name);
    }
}