package TaskFirst.dto;

import TaskFirst.AgeComparator;
import TaskFirst.Student;

import javax.swing.*;
import java.security.Key;
import java.security.KeyStore;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collector;

public class StudentManager {
    public void printStudentList(String header, Collection<Student> collection) {
        System.out.println(header);
        for (Student s : collection) {
            System.out.println(s);
        }
    }

    public void printAvgAge(String header, double avg) {
        System.out.println(header + avg);
    }

    public void printMap(String header, Map<Integer, Student> studentMap) {
        System.out.println(header);
        for (Integer i : studentMap.keySet()) {
            System.out.println("ID = " + i + " " + "Values = " + studentMap.get(i));
        }
    }

    public static Collection<Student> initStudentList() {
        List<Student> studentsList = new ArrayList<>();
        Student student1 = new Student(0, "Andre ", "Balaw ", 19);
        Student student2 = new Student(1, "Chris ", "Ueeel ", 19);
        Student student3 = new Student(2, "Eric ", "Four ", 23);
        Student student4 = new Student(3, "Greg ", "Hawk ", 19);
        Student student5 = new Student(4, "Illon ", "Kool ", 21);
        Student student6 = new Student(5, "Lee ", "Moon ", 22);
        Student student7 = new Student(6, "Nick ", "Olpf ", 19);
        Student student8 = new Student(7, "Peter ", "Qwerty ", 19);
        Student student9 = new Student(8, "Ron ", "Soon ", 20);
        Student student10 = new Student(9, "Tim ", "Uber ", 19);
        Student student11 = new Student(10, "Victoria ", "Wow ", 23);
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);
        studentsList.add(student4);
        studentsList.add(student5);
        studentsList.add(student6);
        studentsList.add(student7);
        studentsList.add(student8);
        studentsList.add(student9);
        studentsList.add(student10);
        studentsList.add(student11);

        return studentsList;
    }

    public static List<Student> getSortedStudentList(Collection<Student> students) {
        //List<Students> studentsListCopy = new ArrayList<>();
        //studentsListCopy.addAll(initStudentList()); // неочень хороший вариант
        AgeComparator myAgeComparator = new AgeComparator();
        List<Student> studentsList = new ArrayList<>(students);
        studentsList.sort(myAgeComparator);
        return studentsList;
    }

    public static List<Student> filterByLastNameLetter(Collection<Student> students, String firstLetter) {
        List<Student> filteredList = new ArrayList<>();
        for (Student st : students) {
            if (st.getSurname().startsWith(firstLetter)) {
                filteredList.add(st);
                System.out.println("Filtered Student by: " + firstLetter + " " + st);
            }
        }
        return filteredList;
    }

    public static double avgByAgeStudentsList(Collection<Student> students) {
        double average = 0;
        int sum = 0;
        int count = 0;
        count = students.size();
//        System.out.println("Count: " + count);
        for (Student st : students) {
            sum += st.getAge();
        }
//        System.out.println("Sum: "+ sum);
        average = sum / count;
//        System.out.println(average);
        return average;
    }

    public static Map<Integer, Student> convertList(Collection<Student> students) { // неуверен верно ли получается
        Map<Integer, Student> studentMap = new HashMap<>();
        for (Student student : students) {
            studentMap.put(student.getId(), student);
        }
        return studentMap;
    }

    public static Map<Integer,Student> filterMap (Map<Integer, Student> originalMap) {
        Map<Integer,Student> filteredMap = new HashMap<>();
        for (Map.Entry<Integer, Student> entry : originalMap.entrySet()){
        if (entry.getValue().getId() >5 ){
        filteredMap.put(entry.getValue().getId(), entry.getValue());}
        }
        return filteredMap;
        }
    }

