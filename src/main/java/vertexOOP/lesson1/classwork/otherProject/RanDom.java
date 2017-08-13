package vertexOOP.lesson1.classwork.otherProject;

import java.util.Random;

public class RanDom {


    private static Random random = new Random();

    public static void main(String[] args) {

        int [] arr = {1,7,12,8,5};


        for (int i : arr) {
            System.out.println(random.nextInt(arr.length));
        }
    }
}
