package TaskSecond.dto;

import java.util.Comparator;

public class ComparatorName implements Comparator<Student> {
    public int compareToName (Student studentOne, Student studentTwo){
        return studentOne.getName().toUpperCase().compareTo(studentTwo.getName().toUpperCase());
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
    }
}
