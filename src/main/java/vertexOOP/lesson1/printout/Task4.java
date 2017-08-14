package vertexOOP.lesson1.printout;

/*
* Programms with methods
*
* */

import java.util.Scanner;

public class Task4 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(searchLastPositionCharInLine(readStringAndReturn(), readSymbolsAndReturn()));

        scanner.close();
    }

    private static int searchLastPositionCharInLine(String s, char ch) {
        System.out.print("Last index: ");
        return s.lastIndexOf(ch);
    }

    private static char readSymbolsAndReturn() {

        System.out.println("Enter char: ");

        char ch = scanner.nextLine().charAt(0);

        return ch;
    }

    private static String readStringAndReturn() {

        System.out.println("Enter string: ");

        String str = scanner.nextLine();

        return str;
    }

}
