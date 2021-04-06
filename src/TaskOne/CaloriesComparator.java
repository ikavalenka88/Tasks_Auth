package TaskOne;

import java.util.Comparator;

public class CaloriesComparator implements Comparator<Vegetable> {
    public int compare(Vegetable ve1, Vegetable ve2) {
        return (int) (ve1.getCalories() - ve2.getCalories());
    }
}
