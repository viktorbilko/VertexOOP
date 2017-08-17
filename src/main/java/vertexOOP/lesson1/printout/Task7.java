package vertexOOP.lesson1.printout;

/*
* @method int myIndexOf gets two lines and looks for the substring (don't use the method indexOf);
* */

import java.util.Scanner;

public class Task7 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter string:");

        String str1 = scanner.nextLine();
        System.out.println("Enter substring:");
        String str2 = scanner.nextLine();

        int x = myIndexOf(str1, str2);

        System.out.println(x);
    }

    private static int myIndexOf(String str1, String str2) {

        int len1 = str1.length();
        int len2 = str2.length();

        if(len1 < len2)
            return -1;

        for (int i = 0, j = 0; i < len1; i++) {

            if (str1.charAt(i) == str2.charAt(j)) {

                if ((len2-1) == j) {
                    return i - j;
                }

                j++;
            }
        }

        return -1;
    }


}
