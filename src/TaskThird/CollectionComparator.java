package TaskThird;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.LongBinaryOperator;

public class CollectionComparator {
    private static final int SIZE=10_000_000;
    private static final int VALUE = 1_000;


    public static void spendTime(long start, long finish) {
        LongBinaryOperator spendTime = (x, y) -> y - x;
        System.out.println(spendTime.applyAsLong(start,finish));
    }

    public static List<Integer> initArrayList() {
        List<Integer> randomNubmerOne = new ArrayList<>();
//        long start = System.nanoTime();
        for (int i = 0; i <= SIZE; i++) {
            randomNubmerOne.add((int) (Math.random() * 100));
        }
//        long stop = System.nanoTime();
//        System.out.println("Time for ArrayList add:");
//        System.out.println(stop-start);
        return randomNubmerOne;
    }

    public static List<Integer> iniLinkedList() {
        List<Integer> randomNumberTwo = new LinkedList<>();
//        long start = System.nanoTime();
        for (int i = 0; i <= SIZE; i++) {
            randomNumberTwo.add((int) (Math.random() * 100));
        }
//        long stop = System.nanoTime();
//        System.out.println("Time for LinkedList add:");
//        System.out.println(stop-start);
        return randomNumberTwo;
    }

    public static void compareAddToCollection() {
        List<Integer> arrayList = initArrayList();
        List<Integer> linkedList = iniLinkedList();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i <= VALUE; i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.println("The ArrayList performance:");
        long startThree = System.nanoTime();//currentTimeMillis() better or not?
        for (Integer integer : list) {
            arrayList.add(0, integer);
        }
        long finishThree = System.nanoTime();
        System.out.println("The time spend for add at the beginning: ");
        spendTime(startThree,finishThree);
//        BinaryOperator<Long> spendT = (x,y)->y-x;
//        System.out.println(spendT.apply(startThree, finishThree));
//        long spendThree = finishThree-startThree;
//        System.out.println("The time spend for add at the beginning " + spendThree);
        long startTwo = System.nanoTime();//currentTimeMillis() better or not?
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(SIZE, linkedList.get(i));
        }
        long finishTwo = System.nanoTime();
        System.out.println("The time spend for add to the end ");
        spendTime(startTwo, finishTwo);
//        long spendTwo = finishTwo-startTwo;
//        System.out.println("The time spend for add to the end " + spendTwo);
        long startOne = System.nanoTime();//currentTimeMillis() better or not?
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(SIZE/2+i,linkedList.get(i));
        }
        long finishOne = System.nanoTime();
        System.out.println("The time spend for add in the middle ");
        spendTime(startOne, finishOne);
//        long spendOne = finishOne-startOne;
//        System.out.println("The time spend for add in the middle " + spendOne);

        System.out.println("The LinkedList performance:");
        long startFour = System.nanoTime();//currentTimeMillis() better or not?
        for (int i = 0; i < list.size(); i++) {
            linkedList.add(SIZE,list.size());
        }
        long finishFour = System.nanoTime();
        System.out.println("The time spend for add to the end ");
        spendTime(startFour, finishFour);
//        long spendFour = finishFour-startFour;
//        System.out.println("The time spend for add to the end " + spendFour);
        long startFive = System.nanoTime();//currentTimeMillis() better or not?
        for (int i = 0; i < list.size(); i++) {
            linkedList.add(SIZE/2+i,list.size());
        }
        long finishFive = System.nanoTime();
        System.out.println("The time spend for add in the middle ");
        spendTime(startFive, finishFive);
//        long spendFive = finishFive-startFive;
//        System.out.println("The time spend for add in the middle " + spendFive);
        long startSix = System.nanoTime();//currentTimeMillis() better or not?
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(0,list.size());
        }
        long finishSix = System.nanoTime();
        System.out.println("The time spend for add at the beginning ");
        spendTime(startSix, finishSix);
//        long spendSix = finishSix-startSix;
//        System.out.println("The time spend for add at the beginning " + spendSix);
    }
    public static void deleteElement(){
        List<Integer> arrayList = initArrayList();
        List<Integer> linkedList = iniLinkedList();
        System.out.println("The ArrayList performance:");
        long startOne = System.nanoTime();
        List<Integer> sublistArrayBegin = initArrayList().subList(0,VALUE+1);
        arrayList.remove(sublistArrayBegin);
        long finishOne = System.nanoTime();
        System.out.println("The time spend for remove at the beginning ");
        spendTime(startOne, finishOne);
//        long spendOne=finishOne-startOne;
//        System.out.println("The time spend for remove at the beginning "+spendOne);
        long startTwo= System.nanoTime();
        List<Integer> sublistArrayMiddle = initArrayList().subList(SIZE/2,SIZE/2+(VALUE+1));//need check
        arrayList.remove(sublistArrayMiddle);
        long finishTwo=System.nanoTime();
        System.out.println("The time spend for remove in the middle ");
        spendTime(startTwo, finishTwo);
//        long spendTwo=finishTwo-startTwo;
//        System.out.println("The time spend for remove in the middle " +spendTwo);
        long startThree= System.nanoTime();
        List<Integer> sublistArrayEnd = initArrayList().subList(SIZE-VALUE,SIZE+1);
        arrayList.remove(sublistArrayEnd);
        long finishThree=System.nanoTime();
        System.out.println("The time spend for remove in the end ");
        spendTime(startThree, finishThree);
//        long spendThree=finishThree-startThree;
//        System.out.println("The time spend for remove in the end " +spendThree);

        System.out.println("The LinkedList performance:");
        long startFour = System.nanoTime();
        List<Integer> sublistLinkedBegin = initArrayList().subList(0, 1001);
        linkedList.remove(sublistLinkedBegin);
        long finishFour = System.nanoTime();
        System.out.println("The time spend for remove at the beginning ");
        spendTime(startFour, finishFour);
//        long spendFour=finishFour-startFour;
//        System.out.println("The time spend for remove at the beginning "+spendFour);
        long startFive= System.nanoTime();
        List<Integer> sublistLinkedMiddle = initArrayList().subList(SIZE/2,SIZE/2+(VALUE+1));//need check
        linkedList.remove(sublistLinkedMiddle);
        long finishFive=System.nanoTime();
        System.out.println("The time spend for remove in the middle ");
        spendTime(startFive, finishFive);
//        long spendFive=finishFive-startFive;
//        System.out.println("The time spend for remove in the middle " +spendFive);
        long startSix= System.nanoTime();
        List<Integer> sublistLinkedEnd = initArrayList().subList(SIZE-VALUE,SIZE+1);
        linkedList.remove(sublistLinkedEnd);
        long finishSix=System.nanoTime();
        System.out.println("The time spend for remove in the end ");
        spendTime(startSix, finishSix);
//        long spendSix=finishSix-startSix;
//        System.out.println("The time spend for remove in the end " +spendSix);
    }
    public static void findElement(){
        int searchNumber = ((int)Math.random()*100);
        List<Integer> arrayList = initArrayList();
        List<Integer> linkedList = iniLinkedList();
//        List<Integer> searchNumberList;
//        List<Integer> listTwo = new ArrayList<Integer>();
        long startOne=System.nanoTime();
        System.out.println("Element present in collection: " + Collections.frequency(arrayList, searchNumber));
        long finishOne = System.nanoTime();
        System.out.println("Time for search elements: ");
        spendTime(startOne, finishOne);
//        long spendOne = finishOne-startOne;
//        System.out.println("Time for search elements: "+spendOne);

        long startTwo=System.nanoTime();
        System.out.println("Element present in collection: " + Collections.frequency(linkedList, searchNumber));
        long finishTwo = System.nanoTime();
        long spendTwo = finishTwo-startTwo;
        System.out.println("Time for search elements: "+spendTwo);
    }
}
