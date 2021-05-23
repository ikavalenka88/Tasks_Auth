package TaskSecond;

import TaskSecond.dto.Student;
import TaskSecond.util.StudentManager;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Collection<Student> student = StudentManager.StudentListGeneration();
//        StudentManager.StudentListGeneration();
        StudentManager.sortByAge((List<Student>) student);
        StudentManager.filterBySurname((List<Student>) student);
        StudentManager.averageByAge((List<Student>) student);
        StudentManager.converToMap(student);
        StudentManager.filterMapByID(student);
    }
}
