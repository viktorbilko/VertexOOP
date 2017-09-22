package vertexOOP.lesson7.classwork;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Viktor Bilko on 18.09.2017.
 */
public class TestThree {

    private static List<Integer> arr1 = new ArrayList<>();
    private static List<Integer> arr2 = new ArrayList<>();
    private static List<Integer> arr3 = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        Thread first = new Thread(new WriteFirstCollection());
        first.start();

        Thread second = new Thread(new WriteSecondCollection());
        second.start();

        first.join();
        second.join();

        Thread third = new Thread(new WriteThreeCollection());
        third.start();
        third.join();

        System.out.println(arr3);
    }

    public static class WriteFirstCollection implements Runnable{

        @Override
        public void run() {
            for (int i = 1; i < 10; i +=2) {
                arr1.add(i);
            }
            System.out.println(arr1);
        }
    }

    private static class WriteSecondCollection implements Runnable {

        @Override
        public void run() {
            for (int i = 2; i <= 10; i +=2) {
                arr2.add(i);
            }
            System.out.println(arr2);
        }
    }

    private static class WriteThreeCollection implements Runnable {

        @Override
        public void run() {
            arr3.addAll(arr1);
            arr3.addAll(arr2);
        }
    }
}
