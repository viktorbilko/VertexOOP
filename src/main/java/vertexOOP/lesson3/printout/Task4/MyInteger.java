package vertexOOP.lesson3.printout.Task4;

/**
 * @author Viktor Bilko on 31.08.2017.
 */
public class MyInteger {

    private int val;

    public MyInteger(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public MyInteger plus(MyInteger myInteger){
        return new MyInteger(this.getVal() + myInteger.getVal());
    }
}
