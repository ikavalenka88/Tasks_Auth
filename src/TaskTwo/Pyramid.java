package TaskTwo;

public class Pyramid extends Shape {
    double h;
    double s;

    public Pyramid(double h, double s) {
        super(h * s * 4 / 3);
        this.h = h;
        this.s = s;
    }
}
