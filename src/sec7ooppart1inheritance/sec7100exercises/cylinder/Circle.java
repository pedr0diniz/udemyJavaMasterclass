package sec7ooppart1inheritance.sec7100exercises.cylinder;

public class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = Math.max(radius, 0.0);
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
