package vertexOOP.lesson3.printout.Task4;

/**
 * @author Viktor Bilko on 31.08.2017.
 */
public class MainMyInteger {

    public static void main(String[] args) {

        MyInteger a = new MyInteger(10);
        MyInteger b = new MyInteger(20);
        MyInteger c = a.plus(b);

        System.out.println(a.getVal() + " + " + b.getVal() + " = " + c.getVal());
    }
}
