package vertexOOP.lesson5.classwork.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by vertex0002 on 04.09.2017.
 */
public class ReplecelTwo {

    public static void main(String[] args) throws IOException {

        String filePath = "src/main/resources/file1.txt";
        final File file = new File(filePath);

        final BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write("fer");
        writer.flush();
        writer.close();
    }

}
