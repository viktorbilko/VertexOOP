package vertexOOP.lesson5.classwork.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by vertex0002 on 04.09.2017.
 */
public class RewriteThree {

    public static void main(String[] args) throws IOException {
        String filePath = "src/main/resources/file.txt";

        List<String> collect = Files
                .lines(Paths.get(filePath))
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
