package Ihar_task;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

//package Ihar_task;
//
//import java.util.Scanner;
//

//    public static void main(String[] args) {
//        int f = 123;  // присваиваем число
//        String c = String.valueOf(f); //  переводим  его в String
////        Scanner scanner = new Scanner(System.in); //этот метод позволяет тебе ввести число в консоль
////        System.out.println("Please,enter the number: ");
////        String n =scanner.nextLine();
////        System.out.println(n); // выводим  что ввели
//        System.out.println(c.length()); //  колличество символов в  числе
////        System.out.println(n.length()); //  колличество символов в  числе
//        if (f<0){
//            System.out.println("Negative value");
//        }
//        if (f > 0){
//            System.out.println("Positive value or equal zero");
//        }else {
//            System.out.println("The number is equal zero");
//        }
//        if ((f>0&&f<10)||(f<0&&f>-10)){
//            System.out.println("The number is one-digit");
//        }
//        if ((f > 9 && f < 100) || (f<-9&&f>-100)){
//            System.out.println("The number is two-digit");
//        }
//        if ((f>100 && f<1000) || (f<-100&&f>-1000)){
//            System.out.println("The number is three-digit");
//        }
//    }
//}
//
//    public static void main(String[] args) {
//        Integer[] e = {1, 2, 3, 4, 5, 2, 4, 5, 6, 1};
//                List<Integer> integers = new ArrayList<>();
//        for (Integer i : e) {
//            integers.add(i);
//        }
//        Integer o1 = integers.get(1);
//        Integer o2 = integers.get(5);
//        Integer i = new Integer(33);
//        Integer i2 = new Integer(33);
//        System.out.println("== : " + (i == i2));
//        System.out.println("equals: " + i.equals(i2));
//        System.out.println("compare " + i.compareTo(i2));
//        System.out.println("hashCode" + i.hashCode());
//        System.out.println("hashCode" + i2.hashCode());
//        System.out.println("-----------------");
//        System.out.println("o1: " + o1);
//        System.out.println("o2: " + o2);
//        System.out.println("== : " + (o1 == o2));
//        System.out.println("equals: " + o1.equals(o2));
//        System.out.println("compare " + o1.compareTo(o2));
//        System.out.println("hashCode " + o1.hashCode());
//        System.out.println("hashCode " + o2.hashCode());
//
//        Integer r = new Integer(2);
//        System.out.println(integers.contains(r));
//    }
//}
//в общем для Integer объектов equal метод работает по значению, то есть берет значение примитивное переменной и по нему сравнивает.
// Единственное, что у двух объектов может быть разное - так это ссылки на объекты (это если сравнивать через ==)