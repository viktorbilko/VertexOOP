package vertexOOP.lesson5.homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by BilkoVV on 07.09.2017.
 */
public class WriterTextImpl implements WriterText {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter text: ");
        String text = scanner.nextLine();
        String filePath = "src/main/resources/file.txt";
        final File file = new File(filePath);


        scanner.close();
    }

    @Override
    public void writer(String text, File file) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        bufferedWriter.write(text);
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
