package TaskThird;

import java.util.List;
import java.util.function.BiConsumer;

import static TaskThird.CollectionComparator.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = initArrayList();
        List<Integer> linkedLis = iniLinkedList();
        BiConsumer<List<Integer>, Integer> addIntoList = CollectionComparator::add;
        BiConsumer<List<Integer>, Integer> removeFromList = CollectionComparator::remove;
        BiConsumer<List<Integer>, Integer> findIntoList = CollectionComparator::find;
        System.out.println("Add to collections");
        printResult(
                getTime((m, t) -> CollectionComparator.add(m, t), arrayList, 1000),
//                getTime(CollectionComparator::add, arrayList, 1000),
//                getTime(addIntoList, arrayList, 1000),
                getTime(addIntoList, linkedLis, 1000)
        );
        System.out.println("Remove from collections");
        printResult(
                getTime(removeFromList, arrayList, 1000),
                getTime(removeFromList, linkedLis, 1000)
        );
        System.out.println("Search element in collections");
        printResult(
                getTime(findIntoList, arrayList, 1000),
                getTime(findIntoList, linkedLis, 1000)
        );

        System.out.println();
    }
}
