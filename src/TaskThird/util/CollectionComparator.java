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

    public static  void remove(List<Integer> list, int count) {
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

//    public static void compareAddToCollection() {
//        List<Integer> arrayList = initArrayList();
//        List<Integer> linkedList = iniLinkedList();
//        List<Integer> list = new ArrayList<Integer>();
//        for (int i = 0; i <= VALUE; i++) {
//            list.add((int) (Math.random() * 100));
//        }
//        System.out.println("The ArrayList performance:");
//        long startThree = System.nanoTime();//currentTimeMillis() better or not?
//        for (Integer integer : list) {
//            arrayList.add(0, integer);
//        }
//        long finishThree = System.nanoTime();
//        System.out.println("The time spend for add at the beginning: ");
//        spendTime(startThree,finishThree);
//        long startTwo = System.nanoTime();//currentTimeMillis() better or not?
//        for (int i = 0; i < list.size(); i++) {
//            arrayList.add(SIZE, linkedList.get(i));
//        }
//        long finishTwo = System.nanoTime();
//        System.out.println("The time spend for add to the end ");
//        spendTime(startTwo, finishTwo);
//        long startOne = System.nanoTime();//currentTimeMillis() better or not?
//        for (int i = 0; i < list.size(); i++) {
//            arrayList.add(SIZE/2+i,linkedList.get(i));
//        }
//        long finishOne = System.nanoTime();
//        System.out.println("The time spend for add in the middle ");
//        spendTime(startOne, finishOne);

//        System.out.println("The LinkedList performance:");
//        long startFour = System.nanoTime();//currentTimeMillis() better or not?
//        for (int i = 0; i < list.size(); i++) {
//            linkedList.add(SIZE,list.size());
//        }
//        long finishFour = System.nanoTime();
//        System.out.println("The time spend for add to the end ");
//        spendTime(startFour, finishFour);
//        long startFive = System.nanoTime();//currentTimeMillis() better or not?
//        for (int i = 0; i < list.size(); i++) {
//            linkedList.add(SIZE/2+i,list.size());
//        }
//        long finishFive = System.nanoTime();
//        System.out.println("The time spend for add in the middle ");
//        spendTime(startFive, finishFive);
//        long startSix = System.nanoTime();//currentTimeMillis() better or not?
//        for (int i = 0; i < list.size(); i++) {
//            arrayList.add(0,list.size());
//        }
//        long finishSix = System.nanoTime();
//        System.out.println("The time spend for add at the beginning ");
//        spendTime(startSix, finishSix);
}
//    public static void deleteElement(){
//        List<Integer> arrayList = initArrayList();
//        List<Integer> linkedList = iniLinkedList();
//        System.out.println("The ArrayList performance:");
//        long startOne = System.nanoTime();
//        List<Integer> sublistArrayBegin = initArrayList().subList(0,VALUE+1);
//        arrayList.remove(sublistArrayBegin);
//        long finishOne = System.nanoTime();
//        System.out.println("The time spend for remove at the beginning ");
//        spendTime(startOne, finishOne);
//        long startTwo= System.nanoTime();
//        List<Integer> sublistArrayMiddle = initArrayList().subList(SIZE/2,SIZE/2+(VALUE+1));//need check
//        arrayList.remove(sublistArrayMiddle);
//        long finishTwo=System.nanoTime();
//        System.out.println("The time spend for remove in the middle ");
//        spendTime(startTwo, finishTwo);
//        long startThree= System.nanoTime();
//        List<Integer> sublistArrayEnd = initArrayList().subList(SIZE-VALUE,SIZE+1);
//        arrayList.remove(sublistArrayEnd);
//        long finishThree=System.nanoTime();
//        System.out.println("The time spend for remove in the end ");
//        spendTime(startThree, finishThree);
//
//        System.out.println("The LinkedList performance:");
//        long startFour = System.nanoTime();
//        List<Integer> sublistLinkedBegin = initArrayList().subList(0, 1001);
//        linkedList.remove(sublistLinkedBegin);
//        long finishFour = System.nanoTime();
//        System.out.println("The time spend for remove at the beginning ");
//        spendTime(startFour, finishFour);
//        long startFive= System.nanoTime();
//        List<Integer> sublistLinkedMiddle = initArrayList().subList(SIZE/2,SIZE/2+(VALUE+1));//need check
//        linkedList.remove(sublistLinkedMiddle);
//        long finishFive=System.nanoTime();
//        System.out.println("The time spend for remove in the middle ");
//        spendTime(startFive, finishFive);
//        long startSix= System.nanoTime();
//        List<Integer> sublistLinkedEnd = initArrayList().subList(SIZE-VALUE,SIZE+1);
//        linkedList.remove(sublistLinkedEnd);
//        long finishSix=System.nanoTime();
//        System.out.println("The time spend for remove in the end ");
//        spendTime(startSix, finishSix);
//    }
//    public static void findElement(){
//        List<Integer> arrayList = initArrayList();
//        List<Integer> linkedList = iniLinkedList();
//        Random random =new Random();
//        System.out.println("The ArrayList performance:");
//        long startOne=System.nanoTime();
//        for (int i = 0; i<VALUE;i++) {
//            int searchNumber = random.nextInt(100);
////            int searchNumber = ((int)Math.random()*100);
//            Collections.frequency(arrayList, searchNumber);
//        }
//        long finishOne = System.nanoTime();
//        System.out.println("Time for search elements: ");
//        spendTime(startOne, finishOne);
//        System.out.println("The LinkedList performance:");
//        long startTwo=System.nanoTime();
//        for (int i=0;i<VALUE;i++) {
////            int searchNumber = ((int)Math.random()*100);
//            int searchNumber = random.nextInt(100);
//            Collections.frequency(linkedList, searchNumber);
//        }
//        long finishTwo = System.nanoTime();
//        System.out.println("Time for search elements: ");
//        spendTime(startTwo, finishTwo);
//    }

