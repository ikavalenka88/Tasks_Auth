package TaskTwo;

import TaskTwo.dto.Ball;
import TaskTwo.dto.Box;
import TaskTwo.dto.Cylinder;
import TaskTwo.dto.Pyramid;

public class RunAndCheck {
    public static void main(String[] args) {
        Ball FB = new Ball(5.4);
        Cylinder FC = new Cylinder(5,8);
        Pyramid FP = new Pyramid(80,25);
        Box FBox = new Box(500);
        System.out.println(FBox.add(FB));
        System.out.println(FBox.add(FC));
        System.out.println(FBox.add(FP));
    }
}
