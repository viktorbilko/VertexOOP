package vertexOOP.lesson5.classwork.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by vertex0002 on 04.09.2017.
 */
public class CountLines {
    public static void main(String[] args) throws IOException {


        String filePath = "src/main/resources/file1.txt";
        final File file = new File(filePath);

        final BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write("Hello" + "\n" + "world");
        writer.flush();
        writer.close();

        List<String> collect = Files
                .lines(Paths.get(filePath))
                .collect(Collectors.toList());

        System.out.println(collect.size());
    }
}
