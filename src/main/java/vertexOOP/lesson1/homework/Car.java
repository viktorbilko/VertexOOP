package vertexOOP.lesson1.homework;

/*
* Created car
* */

public class Car {


    private String model;
    private String color;
    private double engine;
    private int fuelTank;


    private Wheel wheel = new Wheel();

    public void drive(){
        System.out.println("Speed max 200 km/h");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }

}
