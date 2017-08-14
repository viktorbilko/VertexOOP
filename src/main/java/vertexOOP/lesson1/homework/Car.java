package vertexOOP.lesson1.homework;

/*
* Created car
* */

public class Car {

    private final String COLOR = "White";
    private int fuelTank;

    protected Wheel wheel;
    protected Engine engine;

    public String createdEngine(){
        engine = new Engine();
        engine.setCapacity(1.5);
        return "Engine: " + engine.getCapacity() + " litrs";
    }

    public String createdWheel(){
        wheel = new Wheel();
        wheel.setDiameter(15);
        wheel.setIndexOfCarryingCapacity(3);

        Wheel [] wheels = new Wheel[4];

        int i = 0;
        for (Wheel wheel1 : wheels) {
            wheels[i++] = wheel;
        }

        return "Wheel amount " + wheels.length + "; diametr " + wheel.getDiameter() + "; index of carrying capacity " + wheel.getIndexOfCarryingCapacity();
    }

    public void print(){
        System.out.println("Color: " + getCOLOR());
        System.out.println(createdEngine());
        System.out.println("Fuel tank: " + getFuelTank() + " liter");
        System.out.println(createdWheel());
        System.out.println(drive());
    }

    public String drive(){
        return "Max speed  220 km/h";
    }

    public String getCOLOR() {
        return COLOR;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }
}
