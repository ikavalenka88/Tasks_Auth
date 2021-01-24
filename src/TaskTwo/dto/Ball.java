package TaskTwo.dto;

public class Ball extends SolidOfRevolution {
    public Ball(double rad) {
        super(Math.PI * Math.pow(rad, 3) * 4 / 3, rad);
    }
}
