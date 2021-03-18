package TaskThird;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionComparator {
//    public static void initStudentArrayListStream(){
//        IntStream numbers = Arrays.stream(new Random().ints(0, 1000001).limit(1000001).toArray()); // нужно подумать, а есть ли смысл через стримм
//        System.out.println(numbers);
//    }

    public static void initArrayList(){
    ArrayList<Integer> randomNubmerOne = new ArrayList<>(1_000_000);
    for (int i = 0; i<=1000000;i++) {
        randomNubmerOne.add(i);
        Collections.shuffle(randomNubmerOne);
        System.out.println(randomNubmerOne);
    }
    }
    public static void iniLinkedList(){
        List<Integer> randomNumberTwo = new LinkedList<>();
        for (int i = 0;i<=1000000;i++){
            randomNumberTwo.add(i);
            Collections.shuffle(randomNumberTwo);
            System.out.println(randomNumberTwo);
        }
    }
}
