package vertexOOP.lesson1.printout;

import java.util.Scanner;

/*
* Enter String with symbol and space. Count the number of words in sentences.
* */

public class Task3 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int count = 0;

        System.out.println("Enter sentences");

        String str = scanner.nextLine().trim();

        /*for (String x : str.split(" ")) {
            if (!"".equals(x))
                count++;
        }*/

        count = str.split(" +").length;

        System.out.println(count);
    }
}
