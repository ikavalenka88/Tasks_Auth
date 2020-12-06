package TaskThreeCollections;

import java.util.Comparator;

public class AgeComparator implements Comparator<Students> {
    public int compare(Students s1, Students s2) {
        if (s1.age == s2.age) {
            return 0;
        }
        if (s1.age > s2.age) {
            return 1;
        } else {
            return -1;
        }
    }

}
