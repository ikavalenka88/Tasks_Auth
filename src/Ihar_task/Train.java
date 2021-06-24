package Ihar_task;

import java.util.ArrayList;
import java.util.List;


public class Train {
    private static final int SIZE = 10_000_000;
    public static List<Integer> initArrayListT() {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <= SIZE; i++) {
            arrayList.add((int) (Math.random() * 500));
        }
        return arrayList;
    }
}
