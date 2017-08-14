package vertexOOP.lesson1.homework;

import java.util.Scanner;

/**
 * Plant of machines.
 */
public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int number = 0;

        System.out.println("Hello! Welcome to Plant of machines");
        System.out.println("Our Assortment:");
        System.out.println("1. Passenger car");
        System.out.println("2. Sportcar");
        System.out.println("3. Truck");
        System.out.println("Which car for you to build?");

        System.out.println("Enter the serial number of the machine that you build");

        if(scanner.hasNextInt()){
            number = scanner.nextInt();
        } else {
            System.out.println("You enter not integer");
        }

        scanner.close();

        switch (number){
            case 1:
                System.out.println("Created passenger car");
                Car car = new Car();
                car.setFuelTank(150);
                car.print();
                break;
            case 2:
                System.out.println("Created Sportcar");
                SportCar sportcar = new SportCar();
                sportcar.setFuelTank(160);
                sportcar.print();
                break;
            case 3:
                System.out.println("Created Truck");
                Truck truck = new Truck();
                truck.setFuelTank(400);
                truck.print();
            default:
                System.out.println("We dont have car with serial number " + number);
        }
    }
}
