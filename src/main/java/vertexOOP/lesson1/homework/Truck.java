package vertexOOP.lesson1.homework;

/**
 * Created by BilkoVV on 14.08.2017.
 */
public class Truck extends Car {

    private int liftingCapacity = 4500;

    public int getLiftingCapacity() {
        return liftingCapacity; //вантажопідйомність
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Lifting capacity: " + getLiftingCapacity());
    }

    @Override
    public String drive() {
        return "Speed max 180 km/h";
    }

    @Override
    public String createdWheel() {
        wheel = new Wheel();
        wheel.setDiameter(40);
        wheel.setIndexOfCarryingCapacity(3);

        Wheel [] wheels = new Wheel[4];

        int i = 0;
        for (Wheel wheel1 : wheels) {
            wheels[i++] = wheel;
        }

        return "Wheel amount: " + wheels.length + "; diametr: " + wheel.getDiameter() + "; index of carrying capacity";
    }
}
