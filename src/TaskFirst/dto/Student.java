package TaskFirst.dto;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private String surname;
    private int age;

    public Student(int id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String toString() {
        String st = "Student: " + "id: " + id + //updated format
                " name: " + name +
                "surname: " + surname +
                "age: " + age +
                ".";
        return st;
//        return String.format();
    }

    public int compareTo(Student otherStudens) {
        if (this.id == otherStudens.id) {
            return 0;
        } else if (this.id < otherStudens.id) {
            return -1;
        } else {
            return 1;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    }

