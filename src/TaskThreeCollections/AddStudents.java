package TaskThreeCollections;

import java.util.ArrayList;
import java.util.TreeSet;

public class AddStudents {
    public static void main(String[] args) {
        ArrayList<Students> studendsClass = new ArrayList<Students>();
        Students firstStudent = new Students(0, "Andre ", "Balaw ", 19);
        Students secondStudent = new Students(1, "Chris ", "Deeel ", 19);
        Students thirdStudent = new Students(2, "Eric ", "Four ", 23);
        Students fourStudent = new Students(3, "Greg ", "Hawk ", 19);
        Students fiveStudent = new Students(4, "Illon ", "Kool ", 21);
        Students sixStudent = new Students(5, "Lee ", "Moon ", 22);
        Students sevenStudent = new Students(6, "Nick ", "Olpf ", 19);
        Students eightStudent = new Students(7, "Peter ", "Qwerty ", 19);
        Students nineStudent = new Students(8, "Ron ", "Soon ", 20);
        Students tenStudent = new Students(9, "Tim ", "Uber ", 19);
        Students elevenStudent = new Students(10, "Victoria ", "Wow ", 23);
        studendsClass.add(firstStudent);
        studendsClass.add(secondStudent);
        studendsClass.add(thirdStudent);
        studendsClass.add(fourStudent);
        studendsClass.add(fiveStudent);
        studendsClass.add(sixStudent);
        studendsClass.add(sevenStudent);
        studendsClass.add(nineStudent);
        studendsClass.add(eightStudent);
        studendsClass.add(tenStudent);
        studendsClass.add(elevenStudent);

        for (Students s : studendsClass) {
            System.out.println(s);
        }
        AgeComparator myAgeComparator = new AgeComparator();
        studendsClass.sort(myAgeComparator);
        System.out.println("Sorted: ");
        for (Students s:studendsClass){
            System.out.println(s);
        }
    }
}
