package TaskOne;

import java.util.Comparator;

public class WeightComparator implements Comparator<Vegetables> {
    public int compare(Vegetables ve1, Vegetables ve2){
        return (int)(ve1.getWeight() - ve2.getWeight());
    }
}
