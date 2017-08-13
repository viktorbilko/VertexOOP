package vertexOOP.lesson1.classwork.otherProject;

import java.util.Scanner;

public class Course {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int x;

        System.out.println("Select Course");
        System.out.println("1 Start");
        System.out.println("2 OOP");
        System.out.println("3 Professional");

        System.out.println("Enter your course");

        x = scanner.nextInt();

        switch (x){
            case 1:
                System.out.println("Start");
                break;
            case 2:
                System.out.println("OOP");
                break;
            case 3:
                System.out.println("Professional");
                break;
            default:
                System.out.println("Try you later");
        }
    }
}
