package TaskFirst;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection<Student> students = StudentManager.initStudentList();
        Map<Integer, Student> filter = StudentManager.convertList(students);
        StudentManager manager = new StudentManager();
        manager.printStudentList("Created", students);
        List<Student> sortedStudents = StudentManager.getSortedStudentList(students);
        manager.printStudentList("Sorted", sortedStudents);
        List<Student> filteredList = StudentManager.filterByLastNameLetter(students,"U");
        manager.printStudentList("Satisfied the  filter ", filteredList);
        double avgByAge = StudentManager.avgByAgeStudentsList(students);
        manager.printAvgAge( "Result of Avg ", avgByAge);
        Map<Integer,Student> studentMap = StudentManager.convertList(students);
        manager.printMap("Transform into Map", studentMap);
        Map<Integer,Student> filterMap = StudentManager.filterMap(filter);
        manager.printMap("Filtered Map", filterMap);
    }
}
