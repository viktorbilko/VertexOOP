package vertexOOP.lesson5.classwork.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by vertex0002 on 04.09.2017.
 */
public class ReplacelThree {

    public static void main(String[] args) throws IOException {
        String filePath = "src/main/resources/file3.txt";

        List<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("Welcome");

        Files.write(Paths.get(filePath), list);
    }
}
