package vertexOOP.lesson3.classwork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by vertex0002 on 28.08.2017.
 */
public class TestTwo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        IntStream.range(1,21).forEach(s -> list.add(s));
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {

            list.set(i, list.get(i)%2 == 0 ? 10:20);
        }

        System.out.println(list);

        list.removeIf(s -> s == 20);

        System.out.println(list);
    }
}
