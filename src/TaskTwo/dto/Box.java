package TaskTwo.dto;

import TaskTwo.Shape;

import java.util.ArrayList;

public class Box extends Shape {
    public ArrayList<Shape> shapes = new ArrayList<>();
    public double enabled;

    public Box(double enabled) {
        super(enabled);
        this.enabled = enabled;
    }

    public boolean add(Shape shape) {
        if (enabled >= shape.getVolume()) {
            shapes.add(shape);
            this.enabled = enabled - shape.getVolume();
            return true;
        } else {
            return false;
        }
    }
}
