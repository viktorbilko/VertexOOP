package vertexOOP.lesson3.printout.Task2;

/**
 * @author Viktor Bilko on 30.08.2017.
 */
public class MainCar {

    public static void main(String[] args) {

        Car car1 = new Car("auto1");
        Car car2 = new Car("auto2");

        car1.simpleMethod();
        car2.simpleMethod();

        Car.staticMethod();;
        car1.staticMethod();
        car2.staticMethod();

        System.out.println("Count of cars: ".concat(String.valueOf(Car.getCountCars())));
    }
}
