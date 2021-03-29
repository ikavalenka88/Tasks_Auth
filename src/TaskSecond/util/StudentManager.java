package TaskSecond.util;

import TaskSecond.dto.Student;

import java.util.*;
import java.util.stream.Stream;

public class StudentManager {

    public static Collection<Student> StudentListGeneration() {
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
        initStudentList.forEach(System.out::println);
        return initStudentList;
    }

        public static void sortByAge (List<Student> student){
            List<Student> studentsList = new ArrayList<>(student);
            System.out.println("List sorted by Age");
            studentsList.stream().sorted(Comparator.comparingInt(Student::getAge))
                .forEach(System.out::println);
        }
        public  static void filterBySurname (List<Student> student){
            System.out.println("Filtered by Surname: ");
            student.stream().filter(student1 -> student1.getSurname().startsWith("H")).forEach(System.out::println);
        }
        public static void averageByAge (List<Student> student){
            System.out.print("The average age for Student class:");
            OptionalDouble average = student.stream().mapToInt(Student::getAge).average();
       if (average.isPresent())
       {
           System.out.println(average.getAsDouble());
       }
        }
        public static void converToMap(Collection<Student> student){
            System.out.println("Converted to The Map: ");
            student.stream()
                .map(Student -> String.format("ID: %s Name: %s Surname: %s Age: %s", Student.getId(),Student.getName(),Student.getSurname(),Student.getAge()))
                .forEach(System.out::println);
        }
        public static void filterMapByID(Collection<Student> student){
            System.out.println("Filtered mao by ID:");
            student.stream()
                .filter(Student -> Student.getId()>=5)
                .map(Student -> String.format("ID: %s Name: %s Surname: %s Age: %s", Student.getId(),Student.getName(),Student.getSurname(),Student.getAge()))
                .forEach(System.out::println);
        }
}