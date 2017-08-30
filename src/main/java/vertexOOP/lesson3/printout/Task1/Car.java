package vertexOOP.lesson3.printout.Task1;

/**
 * @author Viktor Bilko on 30.08.2017.
 *
 * Task 1. Add in class Car:
 *      1.1 parametrs String number, color, marka
 *      1.2. methods getter and setter
 *      1.3. method printAboutMe (output of all object fields)
 *      1.4. constructors
 */
public class Car {

    private String number;
    private String color;
    private String marka;

    public Car() {
        this("default");
    }

    public Car(String number) {
        this(number,"default");
    }

    public Car(String number, String color) {
        this(number, color,"default");
    }

    public Car(String number, String color, String marka) {
        this.number = number;
        this.color = color;
        this.marka = marka;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void printAboutMe(){
        System.out.println("Car number " + getNumber()
                        + ", color " + getColor()
                        + ", marka " + getMarka());
    }
}
