package TaskThird;

import java.util.*;

public class CollectionComparator {
    public static void fillList() {
        for (int i = 0; i <= 1_000_000; i++) {

        }
    }

//  public static List<Integer>initStudentArrayListStream() {
//      return new Random()
//              .ints(0,1_000_000)
//              .limit(1_000_000)
//              .boxed()
//              .collect(Collectors.toList());
//  }

    //        IntStream numbers = Arrays.stream(new Random().ints(0, 1000001).limit(1000001).toArray()); // нужно подумать, а есть ли смысл через стримм
//        System.out.println(numbers);
//    }
    public static List<Integer> initArrayList() {
        List<Integer> randomNubmerOne = new ArrayList<>(1_000_000);
        long time;
        long start = System.nanoTime();
        for (int i = 0; i <= 1000000; i++) {
            randomNubmerOne.add((int) (Math.random() * 100));
//        System.out.println(randomNubmerOne);
//       Collections.shuffle(randomNubmerOne);
//        long finishTime = System.nanoTime()-start;
//        System.out.println("Time taken to perform " +finishTime/1_000_000_000 + " second");
        }
        long stop = System.nanoTime();
        System.out.println("Time for ArrayList add:");
        System.out.println(stop-start);
        return randomNubmerOne;
    }

    public static List<Integer> iniLinkedList() {
        List<Integer> randomNumberTwo = new LinkedList<>();
        long time;
        long start = System.nanoTime();
        for (int i = 0; i <= 1000000; i++) {
            randomNumberTwo.add((int) (Math.random() * 100));
//            System.out.println(randomNumberTwo);
//        for (int i = 0;i<=1000000;i++){
//            randomNumberTwo.add(i);
//           Collections.shuffle(randomNumberTwo);
//            System.out.println(randomNumberTwo);
        }
        long stop = System.nanoTime();
        System.out.println("Time for LinkedList add:");
        System.out.println(stop-start);
        return randomNumberTwo;
    }

    public static void compareAddToCollection() {
        List<Integer> arrayList = initArrayList();
        List<Integer> linkedList = iniLinkedList();
        final int m = 1000000;
//        Integer[] integer = new Integer[1_000_000];
//        Random r = new Random();
//        for (int i=0;i<integer.length;i++){
//            integer[i] =r.nextInt(1000);
//        }
        long spend;
        long start = System.nanoTime();//currentTimeMillis() better or not?
        System.out.println("The ArrayList performance:");
        arrayList.add(m-1000,m+1);
        spend = System.nanoTime()-start;
        System.out.println("The time spend for add at the end "+spend);
        start= System.nanoTime();
        arrayList.add(0,0);
        spend=System.nanoTime()-start;
        start= System.nanoTime();
        System.out.println("The time spend for add at the beginning "+spend);
        arrayList.add(m/2,m/2);
        spend=System.nanoTime()-start;
        System.out.println("The time spend for add in the middle " +spend);

        System.out.println("The LinkedList performance:");
        start= System.nanoTime();
        linkedList.add(m-1000,m+1);
        spend = System.nanoTime()-start;
        System.out.println("The time spend for add at the end "+spend);
        start= System.nanoTime();
        linkedList.add(0,0);
        spend=System.nanoTime()-start;
        start= System.nanoTime();
        System.out.println("The time spend for add at the beginning "+spend);
        linkedList.add(m/2,m/2);
        spend=System.nanoTime()-start;
        System.out.println("The time spend for add in the middle " +spend);
//        for (int i =0;i<=1000;i++){
//            arrayList.get((int)(Math.random()*(1000000-1)));
//        }
////        stop = System.nanoTime();
////        System.out.println(stop - start);
//
////        LinkedList<Integer> integerLinkedList =new LinkedList<>(Arrays.asList(integer));
////        stop=System.currentTimeMillis();
////        System.out.println(stop - start);
//        start = System.nanoTime();//currentTimeMillis() better or not?
//        for (int i =0;i<=1000;i++){
//            linkedList.get((int)(Math.random()*(1000000-1)));
//        }
//        stop = System.nanoTime(); //currentTimeMillis() better or not?
//        System.out.println(stop - start);
//        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(integer));
//        stop = System.currentTimeMillis();
//        System.out.println(stop - start);
    }
    public static void deleteElement(){
        List<Integer> arrayList = initArrayList();
        List<Integer> linkedList = iniLinkedList();
        final int m = 1000000;
        long spend;
        System.out.println("The ArrayList performance:");
        long start = System.nanoTime();
        arrayList.remove(0);
        spend=System.nanoTime()-start;
        System.out.println("The time spend for remove at the beginning "+spend);
        start= System.nanoTime();
        arrayList.remove(m/2);
        spend=System.nanoTime()-start;
        System.out.println("The time spend for remove in the middle " +spend);
        start= System.nanoTime();
        arrayList.remove(m-999000);
        spend=System.nanoTime()-start;
        System.out.println("The time spend for remove in the end " +spend);
    }
}
