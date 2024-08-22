package sec8ooppart2polymorphism.sec8111polymorphismchallengeexercise;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
        System.out.println("\nCreating a " + this.description);
    }

    public Car() {
        this.description = this.getClass().getSimpleName();
        System.out.println("\nCreating a " + this.description);
    }

    public void startEngine() {
        System.out.println("Starting engine");
    }

    public void drive() {
        runEngine();
        System.out.println("Driving the vehicle");
    }

    protected void runEngine() {
        System.out.println("Running the " + this.description + " engine!");
    }
}

class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private final int cylinders;

    public GasPoweredCar(int cylinders) {
        super();
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the " + cylinders + " cylinders engine");
    }

    @Override
    public void drive() {
        this.avgKmPerLitre = Math.random() * 10;
        runEngine();
        System.out.println("Driving the gas powered car");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.printf("Current usage exceeds the %.2f average km per litre!%n", avgKmPerLitre);
    }
}

class ElectricCar extends Car {
    private double avgKmPerCharge;
    private final int batterySize;

    public ElectricCar(int batterySize) {
        super();
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the " + batterySize + " mAh engine");
    }

    @Override
    public void drive() {
        this.avgKmPerCharge = Math.random() * 500;
        runEngine();
        System.out.println("Driving the electric car");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.printf("Current usage will result in a smaller than %.2f average km per charge!%n", avgKmPerCharge);
    }
}

class HybridCar extends Car {
    private double avgKmPerLitre;
    private final int batterySize;
    private final int cylinders;

    public HybridCar(int batterySize, int cylinders) {
        super();
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the hybrid car " + this.cylinders + " cylinders engine!");
        System.out.println("Running on the " + batterySize + "mah battery for the first few minutes!");
    }

    @Override
    public void drive() {
        this.avgKmPerLitre = Math.random() * 20;
        System.out.println("Driving the hybrid car");
        runEngine();
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.printf("Current usage will result in a smaller than %.2f average km per litre!%n", avgKmPerLitre);
    }
}

class Main {
    public static void main(String[] args) {
        Car car = new Car("Any car");
        car.startEngine();
        car.drive();

        GasPoweredCar gasCar = new GasPoweredCar(8);
        gasCar.startEngine();
        gasCar.drive();

        ElectricCar electricCar = new ElectricCar(50000);
        electricCar.startEngine();
        electricCar.drive();

        HybridCar hybridCar = new HybridCar(10000, 8);
        hybridCar.startEngine();
        hybridCar.drive();
    }
}