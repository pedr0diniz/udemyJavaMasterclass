package sec7ooppart1inheritance.sec776introductiontoclassesandobjects;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setColor("Black");

        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColor("red");

        targa.describeCar();
    }
}
