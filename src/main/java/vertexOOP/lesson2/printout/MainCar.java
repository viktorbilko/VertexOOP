package vertexOOP.lesson2.printout;

import java.util.Random;

/**
 * @author Viktor Bilko on 18.08.2017.
 */
public class MainCar {

    private static Random random = new Random();

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.number = "AA 1111";
        car1.color = "white";
        car2.number = "BB 2222";
        car2.color = "black";

        car1.setColor("red");

        for (int i = 0; i < 10; i++) {

            int rand = ((random.nextInt(11))-5);
            car1.addHuman(rand);
            car1.printAboutMe();
        }

        car1.printAboutMe();
        car2.printAboutMe();
    }
}
