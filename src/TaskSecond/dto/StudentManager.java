package TaskSecond.dto;

import java.util.*;
import java.util.stream.Stream;

public class StudentManager {

    public static void StudentListGeneration() {
        List<Student> initStudentList = List.of(
        new Student(0, "Andre ", "Balaw ", 19),
        new Student(1, "Chris ", "Ueeel ", 19),
        new Student(2, "Eric ", "Four ", 23),
        new Student(3, "Greg ", "Hawk ", 19),
        new Student(4, "Illon ", "Kool ", 21),
        new Student(5, "Lee ", "Moon ", 22),
        new Student(6, "Nick ", "Olpf ", 19),
        new Student(7, "Peter ", "Qwerty ", 19),
        new Student(8, "Ron ", "Soon ", 20),
        new Student(9, "Tim ", "Uber ", 19),
        new Student(10, "Victoria ", "Wow ", 23));
       Stream stream = initStudentList.stream();
        stream.forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------");
        initStudentList.stream().sorted(Comparator.comparingInt(Student::getAge))
                                .forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------");
        initStudentList.stream()
                .filter(student -> student.getSurname().startsWith("H")).forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------");
       OptionalDouble average = initStudentList.stream().mapToInt(student->student.getAge()).average();
       if (average.isPresent())
       {
           System.out.println(average.getAsDouble());
       }
        System.out.println("-------------------------------------------------------------------");
        initStudentList.stream()
                .map(student -> String.format("The Map: ID: %s Name: %s Surname: %s Age: %s", student.getId(),student.getName(),student.getSurname(),student.getAge()))
                .forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------");
        initStudentList.stream()
                .filter(student -> student.getId()>=5)
                .map(student -> String.format("The Map: ID: %s Name: %s Surname: %s Age: %s", student.getId(),student.getName(),student.getSurname(),student.getAge()))
                .forEach(System.out::println);
    }
}