package vertexOOP.lesson7.classwork;

import java.io.*;

/**
 * @author Viktor Bilko on 18.09.2017.
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new WriteTest());
        thread.start();
        thread.join();

        Thread read = new Thread(new ReadTest());
        read.start();
        read.join();

        Thread clearFile = new Thread(new ClearFile());
        clearFile.start();
    }

    public static class WriteTest implements Runnable{

        @Override
        public void run() {
            String path = "src/main/resources/file.txt";
            File file = new File(path);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write("Hello");
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static class ReadTest implements Runnable {

        @Override
        public void run() {
            String path = "src/main/resources/file.txt";
            File file = new File(path);

            try (BufferedReader reader = new BufferedReader(new FileReader(file))){
                String buff;
                while ((buff = reader.readLine()) != null) {
                    System.out.println(buff);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static class ClearFile implements Runnable {

        @Override
        public void run() {
            String path = "src/main/resources/file.txt";
            File file = new File(path);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write("");
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
