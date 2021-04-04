package TaskThird;

import com.sun.security.jgss.GSSUtil;

import java.util.*;
import java.util.function.Consumer;

public class CollectionComparator {
    private static final int SIZE=10_000_000;
    private static final int VALUE = 1_000;

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
        System.out.println("The ArrayList performance:");
        long startThree = System.nanoTime();//currentTimeMillis() better or not?
        for (int i = 0; i < VALUE; i++) {
            arrayList.add(0,(int) (Math.random() * 100));
        }
        long finishThree = System.nanoTime();
        long spendThree = finishThree-startThree;
        System.out.println("The time spend for add at the beginning " + spendThree);
        long startTwo = System.nanoTime();//currentTimeMillis() better or not?
        for (int i = 0; i < VALUE; i++) {
            arrayList.add(SIZE,(int) (Math.random() * 100));
        }
        long finishTwo = System.nanoTime();
        long spendTwo = finishTwo-startTwo;
        System.out.println("The time spend for add to the end " + spendTwo);
        long startOne = System.nanoTime();//currentTimeMillis() better or not?
        for (int i = 0; i < VALUE; i++) {
            arrayList.add(SIZE/2+i,(int) (Math.random() * 100));
        }
        long finishOne = System.nanoTime();
        long spendOne = finishOne-startOne;
        System.out.println("The time spend for add in the middle " + spendOne);

        System.out.println("The LinkedList performance:");
        long startFour = System.nanoTime();//currentTimeMillis() better or not?
        for (int i = 0; i < VALUE; i++) {
            linkedList.add(SIZE,(int) (Math.random() * 100));
        }
        long finishFour = System.nanoTime();
        long spendFour = finishFour-startFour;
        System.out.println("The time spend for add to the end " + spendFour);
        long startFive = System.nanoTime();//currentTimeMillis() better or not?
        for (int i = 0; i < VALUE; i++) {
            linkedList.add(SIZE/2+i,(int) (Math.random() * 100));
        }
        long finishFive = System.nanoTime();
        long spendFive = finishFive-startFive;
        System.out.println("The time spend for add in the middle " + spendFive);
        long startSix = System.nanoTime();//currentTimeMillis() better or not?
        for (int i = 0; i < VALUE; i++) {
            arrayList.add(0,(int) (Math.random() * 100));
        }
        long finishSix = System.nanoTime();
        long spendSix = finishSix-startSix;
        System.out.println("The time spend for add at the beginning " + spendSix);
    }
    public static void deleteElement(){
        List<Integer> arrayList = initArrayList();
        List<Integer> linkedList = iniLinkedList();
        System.out.println("The ArrayList performance:");
        long startOne = System.nanoTime();
        List<Integer> sublistArrayBegin = initArrayList().subList(0,VALUE+1);
        arrayList.remove(sublistArrayBegin);
        long finishOne = System.nanoTime();
        long spendOne=finishOne-startOne;
        System.out.println("The time spend for remove at the beginning "+spendOne);
        long startTwo= System.nanoTime();
        List<Integer> sublistArrayMiddle = initArrayList().subList(SIZE/2,SIZE/2+(VALUE+1));//need check
        arrayList.remove(sublistArrayMiddle);
        long finishTwo=System.nanoTime();
        long spendTwo=finishTwo-startTwo;
        System.out.println("The time spend for remove in the middle " +spendTwo);
        long startThree= System.nanoTime();
        List<Integer> sublistArrayEnd = initArrayList().subList(SIZE-VALUE,SIZE+1);
        arrayList.remove(sublistArrayEnd);
        long finishThree=System.nanoTime();
        long spendThree=finishThree-startThree;
        System.out.println("The time spend for remove in the end " +spendThree);

        System.out.println("The LinkedList performance:");
        long startFour = System.nanoTime();
        List<Integer> sublistLinkedBegin = initArrayList().subList(0, 1001);
        linkedList.remove(sublistLinkedBegin);
        long finishFour = System.nanoTime();
        long spendFour=finishFour-startFour;
        System.out.println("The time spend for remove at the beginning "+spendFour);
        long startFive= System.nanoTime();
        List<Integer> sublistLinkedMiddle = initArrayList().subList(SIZE/2,SIZE/2+(VALUE+1));//need check
        linkedList.remove(sublistLinkedMiddle);
        long finishFive=System.nanoTime();
        long spendFive=finishFive-startFive;
        System.out.println("The time spend for remove in the middle " +spendFive);
        long startSix= System.nanoTime();
        List<Integer> sublistLinkedEnd = initArrayList().subList(SIZE-VALUE,SIZE+1);
        linkedList.remove(sublistLinkedEnd);
        long finishSix=System.nanoTime();
        long spendSix=finishSix-startSix;
        System.out.println("The time spend for remove in the end " +spendSix);
    }
    public static void findElement(){
        List<Integer> arrayList = initArrayList();
        List<Integer> linkedList = iniLinkedList();
        long startOne=System.nanoTime();
        arrayList.subList(0,VALUE);
        for (int i =0;i<=VALUE;i++){
            arrayList.get(i);
            System.out.printf(" %d ",arrayList.get(i));
        }
        long finishOne = System.nanoTime();
        long spendOne = finishOne-startOne;
        System.out.println("Time for search elements from beginning: "+spendOne);

        long startTwo = System.nanoTime();
        arrayList.subList(SIZE/2,(SIZE/2)+VALUE); //need check
        for (int i = 0;i<=VALUE;i++){
            arrayList.get(i);
            System.out.printf(" %d ",arrayList.get(i));
        }
        long finishTwo = System.nanoTime();
        long spendTwo = finishTwo-startTwo;
        System.out.println("Time for search elements from the middle: "+spendTwo);

        long startThree= System.nanoTime();
        arrayList.subList(SIZE-VALUE, SIZE+1);
        for (int i = 0;i<=VALUE;i++){
            arrayList.get(i);
            System.out.printf(" %d ",arrayList.get(i));
        }
        long finishThree = System.nanoTime();
        long spendThree = finishThree-startThree;
        System.out.println("Time for search elements from the end: "+spendThree);

        System.out.println("The LinkedList performance:");
        long startFour=System.nanoTime();
        for (int i =0;i<=VALUE;i++){
            linkedList.get(i);
            System.out.printf(" %d ",linkedList.get(i));
        }
        long finishFour = System.nanoTime();
        long spendFour = finishFour-startFour;
        System.out.println("Time for search elements from beginning: "+spendFour);

        long startFive = System.nanoTime();
        arrayList.subList(SIZE/2,(SIZE/2)+VALUE); //need check
        for (int i = 0;i<=VALUE;i++){
            arrayList.get(i);
            System.out.printf(" %d ",arrayList.get(i));
        }
        long finishFive = System.nanoTime();
        long spendFive = finishFive-startFive;
        System.out.println("Time for search elements from the middle: "+spendFive);

        long startSix= System.nanoTime();
        arrayList.subList(SIZE-VALUE, SIZE);
        for (int i = 0;i<=VALUE;i++){
            arrayList.get(i);
            System.out.printf(" %d ",arrayList.get(i));
        }
        long finishSix = System.nanoTime();
        long spendSix = finishSix-startSix;
        System.out.println("Time for search elements from the end: "+spendSix);
    }
}
