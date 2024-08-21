package sec7ooppart1inheritance.sec7100exercises.poolarea;

public class Rectangle {
    private final double width;
    private final double length;

    public Rectangle(double width, double length) {
        this.width = Math.max(width, 0.0);
        this.length = Math.max(length, 0.0);
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public double getArea() {
        return this.width * this.length;
    }
}
