package vertexOOP.lesson5.classwork.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by vertex0002 on 04.09.2017.
 */
public class Rewrite {

    public static void main(String[] args) throws IOException {
        String filePath = "src/main/resources/file.txt";
        final File file = new File(filePath);

        FileReader reader = new FileReader(file);

        int buff;

        while ((buff = reader.read()) != -1) {
            System.out.print((char) buff);
        }
    }
}
