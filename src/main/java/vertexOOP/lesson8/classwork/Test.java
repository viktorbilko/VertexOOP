package vertexOOP.lesson8.classwork;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Viktor Bilko on 21.09.2017.
 * Записувати кожну 10ту цифру з колекції у файл окремим потоком
 */
public class Test {

/*    static List <Integer> list = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        Test test = new Test();

        for (int i = 0; i < 2; i++) {
//            final Thread thread = new Thread(test::printStr2);
            thread.start();
        }
    }

    private void printStr2() throws IOException {
        String filePath = "src/main/resources/file1.txt";
        final File file = new File(filePath);

        final BufferedWriter writer = new BufferedWriter(new FileWriter(file));

        for (int i = 0; i < 50; i++){
            list.add(i);
            if (i%10 !=0){
                new Thread().start();

            }
        }

    }

    private void write() throws IOException {
        String filePath = "src/main/resources/file1.txt";
        final File file = new File(filePath);

        final BufferedWriter writer = new BufferedWriter(new FileWriter(file));

        writer.write("fer");

        writer.flush();
        writer.close();
    }*/
}
