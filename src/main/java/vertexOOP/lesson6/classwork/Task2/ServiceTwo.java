package vertexOOP.lesson6.classwork.Task2;

import java.lang.reflect.Method;

/**
 * Created by vertex0002 on 07.09.2017.
 */
public class ServiceTwo {

    public static void main(String[] args) {

        ServiceTwo serviceTwo = new ServiceTwo();
        try {
            serviceTwo.printOne();
            serviceTwo.printTwo();
            serviceTwo.printThree();
        } catch (DoNotAllowPrintException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public void printThree() throws DoNotAllowPrintException, NoSuchMethodException {
        final Class<? extends ServiceTwo> clazz = getClass();
        Method print = clazz.getMethod("printThree");
        if (print.isAnnotationPresent(AllowPrint.class)) {
            System.out.println("printThree");
        } else {
            throw new DoNotAllowPrintException();
        }
    }

    public void printTwo() throws NoSuchMethodException, DoNotAllowPrintException {
        final Class<? extends ServiceTwo> clazz = getClass();
        Method print = clazz.getMethod("printTwo");
        if (print.isAnnotationPresent(AllowPrint.class)) {
            System.out.println("printTwo");
        } else {
            throw new DoNotAllowPrintException();
        }
    }

    @AllowPrint
    public void printOne() throws DoNotAllowPrintException, NoSuchMethodException {

        final Class<? extends ServiceTwo> clazz = getClass();
        Method print = clazz.getMethod("printOne");
        if (print.isAnnotationPresent(AllowPrint.class)) {
            System.out.println("printOne");
        } else {
            throw new DoNotAllowPrintException();
        }
    }
}
