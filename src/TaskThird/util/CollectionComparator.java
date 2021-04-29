package TaskThird.util;

import java.util.*;
import java.util.function.BiConsumer;

public class CollectionComparator {
    private static final int SIZE = 10_000_000;
    private static final int VALUE = 1_000;

//    public  List<Integer> add (List<Integer> list,int count){
//        for (int i =0;i<count;i++){
//            list.add((int)Math.random()*100);
//        }
//        return list;
//    }

    public static void add(List<Integer> list, int count) {
        for (int i = 0; i < count; i++) {
            list.add((int) Math.random() * 100);
        }

    }

    public static void remove(List<Integer> list, int count) {
        for (int i = 0; i < count; i++) {
            list.remove(i);
        }
    }

    public static void find(List<Integer> list, int count) {
        for (int i = 0; i < count; i++) {
            Collections.frequency(list, count);
        }
    }

    public static void printResult(long arrayListResult, long linkedListResult) {
        System.out.println("The ArrayList: " + arrayListResult);
        System.out.println("The LinkedList: " + linkedListResult);
    }

    public static long getTime(BiConsumer<List<Integer>, Integer> method,
                               List<Integer> list,
                               int count) { //use interface consumer<T>
        long startTime = System.nanoTime();
        method.accept(list, count);
        return System.nanoTime() - startTime;
    }

    public static List<Integer> initArrayList() {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <= SIZE; i++) {
            arrayList.add((int) (Math.random() * 100));
        }
        return arrayList;
    }

    public static List<Integer> iniLinkedList() {
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i <= SIZE; i++) {
            linkedList.add((int) (Math.random() * 100));
        }
        return linkedList;
    }
}

