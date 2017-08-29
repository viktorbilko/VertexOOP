package vertexOOP.lesson2.printout;

/**
 * @author Viktor Bilko on 18.08.2017.
 * Task 1. add parametr String color.
 * Task 2. add getter and setter for parametrs String color.
 */
public class Car {
    String number;
    String color;
    int countHuman = 0;

    public void addHuman(int countHuman){
        this.countHuman = countHuman;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printAboutMe(){
        System.out.print(String.join(" ", number, getColor()));
        System.out.println(" " + countHuman + " people");
    }
}
