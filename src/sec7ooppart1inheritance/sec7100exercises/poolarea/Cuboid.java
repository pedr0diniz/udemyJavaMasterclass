package sec7ooppart1inheritance.sec7100exercises.poolarea;

public class Cuboid extends Rectangle {
    private final double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = Math.max(height, 0.0);
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }
}
