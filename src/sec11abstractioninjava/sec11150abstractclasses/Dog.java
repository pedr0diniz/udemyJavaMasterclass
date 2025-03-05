package sec11abstractioninjava.sec11150abstractclasses;

import java.util.Objects;

public class Dog extends Mammal {
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equals("slow")) {
            System.out.print(getExplicitType() + " walking");
        } else {
            System.out.print(getExplicitType() + " running");
        }
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " sheds hair all the time");
    }

    @Override
    public void makeNoise() {

        if (Objects.equals(type, "Wolf")) {
            System.out.print("Howling! ");
        } else {
            System.out.print("Woof! ");
        }
    }
}
