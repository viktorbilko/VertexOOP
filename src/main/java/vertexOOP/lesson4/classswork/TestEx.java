package vertexOOP.lesson4.classswork;

import java.util.Scanner;

import static vertexOOP.lesson1.homework.Main.scanner;

/**
 * Created by vertex0002 on 31.08.2017.
 */
public class TestEx {

    public static void main(String[] args) {

        try {
            System.out.print("Enter name: ");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            System.out.println(nameEquals(name));

            name = null;
            System.out.println(nameEquals(name));


        } catch (NullPointerException e){
            System.out.println("wrong 1");
        } finally {
            scanner.close();

            try {

                String name = "Alex";
                Integer.valueOf(name);
            } catch (NumberFormatException e){
                System.out.println("wrong 2");
            }
        }
    }

    private static boolean nameEquals(String name) {
        return name.equals("Victor");
    }
}
