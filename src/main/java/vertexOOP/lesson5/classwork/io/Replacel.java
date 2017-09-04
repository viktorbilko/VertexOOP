package vertexOOP.lesson5.classwork.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by vertex0002 on 04.09.2017.
 */
public class Replacel {

    public static void main(String[] args) throws IOException {

        String filePath = "src/main/resources/file.txt";

        final File file = new File(filePath);

        FileWriter writer = new FileWriter(file, true);

        writer.write("Welcome");
        writer.write("To Kyiv");
        writer.write("\n");
        writer.flush();

        writer.close();
    }
}
