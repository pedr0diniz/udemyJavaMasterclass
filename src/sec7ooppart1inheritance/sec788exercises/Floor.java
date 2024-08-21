package sec7ooppart1inheritance.sec788exercises;

class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = Math.max(width, 0.0);
        this.length = Math.max(length, 0.0);
    }

    public double getArea() {
        return width * length;
    }
}

class Carpet {
    private double cost;

    public Carpet(double cost) {
        this.cost = Math.max(cost, 0.0);
    }

    public double getCost() {
        return cost;
    }
}

class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}