package vertexOOP.lesson4.classswork;

/**
 * Created by vertex0002 on 31.08.2017.
 */
public class NoProtocolException extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("No protocol");
    }
}
