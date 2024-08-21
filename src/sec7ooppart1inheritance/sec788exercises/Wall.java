package sec7ooppart1inheritance.sec788exercises;

public class Wall {
    private double width;
    private double height;

    public Wall() {

    }

    public Wall(double width, double height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {
        this.width = Math.max(width, 0.0);
    }

    public void setHeight(double height) {
        this.height = Math.max(height, 0.0);
    }

    public double getArea() {
        return width * height;
    }
}