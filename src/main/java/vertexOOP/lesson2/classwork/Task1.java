package vertexOOP.lesson2.classwork;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {

        System.out.println(returnString("String"));

        notReturn("Not return String");

        System.out.println(returnBoolean(1, 2));

        System.out.println(Arrays.toString(returnArr(1, 2)));
    }

    private static int [] returnArr(int i, int i1) {
        int [] arr = new int[2];
        arr[0] = i;
        arr[1] = i1;
        return arr;
    }

    private static boolean returnBoolean(int i, int i1) {
        return i < i1;
    }

    private static void notReturn(String not_return_string) {
        System.out.println(not_return_string);
    }

    private static String returnString(String string) {
        return string;
    }
}
