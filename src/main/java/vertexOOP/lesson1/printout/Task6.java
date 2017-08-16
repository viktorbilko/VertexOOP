package vertexOOP.lesson1.printout;

import java.util.Scanner;

/*
* @method boolean myEquals compares two strings
* */

public class Task6 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter first string:");
        String str1 = scanner.nextLine();
        System.out.println("Enter second string:");
        String str2 = scanner.nextLine();

        System.out.println(myEquals(str1, str2));
    }

    private static boolean myEquals(String str1, String str2) {

        char [] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();

        if (ch1.length != ch2.length)
            return false;

        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != ch2[i])
                return false;
        }

        return true;
    }
}
