package vertexOOP.lesson3.classwork;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by vertex0002 on 28.08.2017.
 */
public class CollectionSet {

    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();
        set.add(12);
        set.add(7);
        set.add(8);

        set.forEach(System.out::println);

        for (Integer elem : set) {
            System.out.println(elem);
        }

        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(set);

        System.out.println(set.hashCode());
    }
}
