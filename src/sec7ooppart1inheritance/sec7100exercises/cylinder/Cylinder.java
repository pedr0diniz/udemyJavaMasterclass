package sec7ooppart1inheritance.sec7100exercises.cylinder;

public class Cylinder extends Circle {
    private final double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = Math.max(height, 0.0);
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }
}
