package vertexOOP.lesson6.classwork.Task2;

/**
 * Created by vertex0002 on 07.09.2017.
 */
public class DoNotAllowPrintException extends Exception {
    @Override
    public void printStackTrace() {

        System.out.println("Do Not Allow Print");

    }
}
