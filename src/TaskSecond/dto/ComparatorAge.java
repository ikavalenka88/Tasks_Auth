package TaskSecond.dto;

import java.util.Comparator;

public class ComparatorAge implements Comparator<Student> {
    public int compareToAge (Student studentOne, Student studentTwo){
        return studentOne.getAge().compareTo(studentTwo.getId());
    }
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge().compareTo(o2.getId());
    }
}
