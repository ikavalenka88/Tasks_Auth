package TaskThird;

import java.util.List;

import static TaskThird.CollectionComparator.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = initArrayList();
        List<Integer> linkedLis = iniLinkedList();
        CollectionComparator collectionComparator = new CollectionComparator();
        printResult(getTime(collectionComparator->collectionComparator.add(arrayList,1000))),
                getTime(m->add(linkedLis,1000));
        System.out.println();
//        initArrayList();
//        iniLinkedList();
//        compareAddToCollection();
//        deleteElement();
//        findElement();
    }
}
