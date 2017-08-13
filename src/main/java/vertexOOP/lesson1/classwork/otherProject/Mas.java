package vertexOOP.lesson1.classwork.otherProject;

public class Mas {

    public static void main(String[] args) {

        int [] arr = new int[9];
        int count = 1;

        for (int i = 0; i < arr.length; i++) {
                arr[i] = count;
            if (i <4) {
                count++;
            } else {
                count--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
