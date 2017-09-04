package vertexOOP.lesson5.classwork.io;

/**
 * Created by vertex0002 on 04.09.2017.
 */
public class NoFileException extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("No File exist");
    }
}
