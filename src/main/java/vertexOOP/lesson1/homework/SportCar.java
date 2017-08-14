package vertexOOP.lesson1.homework;

/*
* Created sportscar.
* */

public class SportCar extends Car {

    @Override
    public String drive() {
        return "Speed max 350 km/h";
    }

    @Override
    public String createdWheel() {
        wheel = new Wheel();

        wheel.setDiameter(21);
        wheel.setIndexOfCarryingCapacity(4);

        Wheel [] wheels = new Wheel[4];

        int i = 0;
        for (Wheel wheel1 : wheels) {
            wheels[i++] = wheel;
        }

        return "Wheel amount: " + wheels.length + "; diametr: " + wheel.getDiameter() + "; index of carrying capacity";
    }
}
