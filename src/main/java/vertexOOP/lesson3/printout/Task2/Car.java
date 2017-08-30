package vertexOOP.lesson3.printout.Task2;

/**
 * @author Viktor Bilko on 30.08.2017.
 *
 * Task 2. Add method getCountCars.
 */
public class Car {

    private String number;
    private static int countCars = 0;

    public Car(String number) {
        this.number = number;
        this.countCars++;
    }

    public static int getCountCars() {
        return countCars;
    }

    public static void staticMethod(){
        System.out.println("print by static Method");
    }

    public void simpleMethod(){
        System.out.println("simpleMethod" + number);
    }
}
