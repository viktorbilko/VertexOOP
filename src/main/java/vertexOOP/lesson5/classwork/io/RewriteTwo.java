package vertexOOP.lesson5.classwork.io;

import java.io.*;

/**
 * Created by vertex0002 on 04.09.2017.
 */
public class RewriteTwo {

    public static void main(String[] args) throws IOException {
        String filePath = "src/main/resources/file2.txt";

        final File file = new File(filePath);

        final BufferedReader reader = new BufferedReader(new FileReader(file));

        String buff;
        while ((buff = reader.readLine()) != null) {
            System.out.println(buff);
        }
    }
}
