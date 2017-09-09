package vertexOOP.lesson5.classwork.users.impl;

import vertexOOP.lesson5.classwork.users.UserPrinter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by vertex0002 on 04.09.2017.
 */
public class UserPrinterImpl implements UserPrinter {
    String filePath = "src/main/resources/fileUser.txt";

    @Override
    public void print() throws IOException {
        final List<String> collect = Files.lines(Paths.get(filePath)).collect(Collectors.toList());
        System.out.println(collect);
    }
}
