package vertexOOP.lesson5.classwork.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by vertex0002 on 04.09.2017.
 */
public class CountLines2 {

    public static void main(String[] args) throws IOException {

        String filePath = "src/main/resources/file1.txt";
        final File file = new File(filePath);

        Set<String> set = new HashSet<>();

        final FileReader fileReader = new FileReader(file);
        final StreamTokenizer tokenizer = new StreamTokenizer(fileReader);

        while (tokenizer.nextToken() != StreamTokenizer.TT_EOF) {
            if (tokenizer.sval != null) {
                set.add(tokenizer.sval);
            }
        }
        System.out.println(set);
    }
}

