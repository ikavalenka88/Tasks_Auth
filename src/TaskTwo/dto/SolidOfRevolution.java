package TaskTwo.dto;

import TaskTwo.Shape;

public class SolidOfRevolution extends Shape {
    public double radius;

    public SolidOfRevolution(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
