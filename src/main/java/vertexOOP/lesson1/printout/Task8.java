package vertexOOP.lesson1.printout;

import java.util.Scanner;

/*
* @method myEndsWith gets two lines and returns boolean value if line 1 end with line 2
* */

public class Task8 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter first string:");
        String str1 = scanner.nextLine();
        System.out.println("Enter second string:");
        String str2 = scanner.nextLine();

        boolean b = myEndsWith(str1, str2);
        System.out.println(b);
    }

    private static boolean myEndsWith(String str1, String str2) {

        int str1Length1 = str1.length();
        int str2Length2 = str2.length();

        if(str1Length1 < str2Length2)
            return false;

        for (int i = str1Length1-1, j = str2Length2-1; j >= 0; i--, j--) {
            if (str1.charAt(i) != str2.charAt(j))
                return false;
        }

        return true;
    }
}
