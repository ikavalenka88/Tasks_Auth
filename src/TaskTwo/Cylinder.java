package TaskTwo;

public class Cylinder extends SolidOfRevolution {
    public double height;

    public Cylinder(double radius, double height) {
        super(Math.PI * radius * radius * height, radius);
        this.height = height;
    }
}
