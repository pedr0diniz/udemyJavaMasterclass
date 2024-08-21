package sec7ooppart1inheritance.sec783referencevsobjectvsinstancevsclass;

public class Main {
    public static void main(String[] args) {
        House blueHouse = new House("blue");
        House anotherHouse = blueHouse;

        System.out.println(blueHouse.getColor()); // blue
        System.out.println(anotherHouse.getColor()); // blue

        anotherHouse.setColor("yellow");
        System.out.println(blueHouse.getColor()); // yellow, objects share the same reference
        System.out.println(anotherHouse.getColor()); // yellow

        House greenHouse = new House("green");
        anotherHouse = greenHouse;

        System.out.println(blueHouse.getColor()); // yellow
        System.out.println(greenHouse.getColor()); // green
        System.out.println(anotherHouse.getColor()); // green
    }
}

class House {
    private String color;

    public House(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}