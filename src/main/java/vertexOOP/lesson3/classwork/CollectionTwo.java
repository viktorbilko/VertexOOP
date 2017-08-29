package vertexOOP.lesson3.classwork;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by vertex0002 on 28.08.2017.
 */
public class CollectionTwo {

    public static void main(String[] args) {

        List full = new LinkedList<>();

        IntStream.range(0,10).forEach(s -> full.add(s));

        full.add("A");
        full.add("A");
        full.add("A");
        full.add("B");
        full.add("A");
        full.add("A");
        full.add("A");
        full.add("C");
        full.add("C");
        full.add("C");

        print(full);

        List<Integer> listInt = new LinkedList<>();
        List<String> listString = new LinkedList<>();

        for (Object element : full) {
            if (element instanceof String) {
                listString.add((String) element);
            } else {
                listInt.add((Integer) element);
            }
        }

        print(listInt);
        print(listString);

    }

    private static void print(List list) {
        System.out.println(list);
    }
}
