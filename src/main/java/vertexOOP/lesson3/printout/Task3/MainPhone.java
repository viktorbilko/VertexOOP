package vertexOOP.lesson3.printout.Task3;

/**
 * @author Viktor Bilko on 30.08.2017.
 */
public class MainPhone {

    public static void main(String[] args) {

        Phone.setPhones(new Phone("100","ZTE"));
        Phone.setPhones(new Phone("101","Samsung"));
        Phone.setPhones(new Phone("102","Iphone"));
        Phone.setPhones(new Phone("103","Samsung"));
        Phone.setPhones(new Phone("104","Samsung"));
        Phone.setPhones(new Phone("105","Xiaomi"));
        Phone.setPhones(new Phone("106","Samsung"));
        Phone.setPhones(new Phone("107","Lenovo"));
        Phone.setPhones(new Phone("108","Samsung"));
        Phone.setPhones(new Phone("109","ZTE"));

        System.out.println("Check the existing number: 100");
        System.out.println(Phone.isNumberExist("100"));

        System.out.println("Check the not existing number: 200");
        System.out.println(Phone.isNumberExist("200"));

        Phone.getRandomPhone().call(Phone.getRandomPhone().getMyNumber());

    }
}
