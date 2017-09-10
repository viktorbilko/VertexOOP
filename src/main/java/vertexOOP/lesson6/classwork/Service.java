package vertexOOP.lesson6.classwork;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by vertex0002 on 07.09.2017.
 */
@Reference
@RemindMe(reason = "reds",where = "werer")
@CodingTime()
public class Service {

    public static void main(String[] args) throws NoSuchMethodException {
        Service service = new Service();
        service.printTwo();
        service.printThree();
        service.read();
    }

    @RemindMe(reason = "reds", where = "werer")
    public void print() throws NoSuchMethodException {
        final Class<? extends Service> clazz = getClass();
        Method print = clazz.getMethod("print");
        System.out.println(print.isAnnotationPresent(RemindMe.class));
    }

    @CodingTime
    public void printTwo() throws NoSuchMethodException {
        final Class<? extends Service> clazz = getClass();
        Method printTwo = clazz.getMethod("printTwo");
        System.out.println(printTwo.isAnnotationPresent(CodingTime.class));
    }

    @Reference
    public void printThree() throws NoSuchMethodException {
        final Class<? extends Service> clazz = getClass();
        Method printThree = clazz.getMethod("printThree");
        System.out.println(printThree.isAnnotationPresent(Reference.class));
    }

    @CodingTime
    public void read() throws NoSuchMethodException {
        final Class<? extends Service> clazz = getClass();
        Method read = clazz.getMethod("read");
        CodingTime annotation = read.getAnnotation(CodingTime.class);
        System.out.println(annotation.go());
        System.out.println(annotation.run());
    }
}
