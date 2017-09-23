package vertexOOP.lesson7.homework;

import steps.MyFirstLib;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Viktor Bilko on 23.09.2017.
 */
public class TestMyLib {

    public static void main(String[] args) {
        List list = new LinkedList<>();

        IntStream.rangeClosed(1,10).forEach(s -> list.add(s));
        System.out.println(list);

        MyFirstLib.deletePairedNumbers(list);
        System.out.println(list);
    }
}
