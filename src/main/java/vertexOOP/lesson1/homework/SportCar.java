package vertexOOP.lesson1.homework;

/*
* Created sportscar.
* */

public class SportCar extends Car {

    @Override
    public void drive() {
        System.out.println("Speed max 350 km/h");
    }

    @Override
    public void createdWheel() {
        wheel.setDiameter(21);
        wheel.setIndexOfCarryingCapacity(4);
    }
}
