package vertexOOP.lesson5.homework;

import java.io.File;
import java.io.IOException;

/**
 * Created by BilkoVV on 07.09.2017.
 */
public interface WriterText {

    void writer(String text, File file) throws IOException;
}
