package TaskOne;

import java.util.Comparator;

public class WeightComparator implements Comparator<Vegetable> {
    public int compare(Vegetable ve1, Vegetable ve2) {
        return (int) (ve1.getWeight() - ve2.getWeight());
    }
}
