package vertexOOP.lesson8.classwork;

/**
 * @author Viktor Bilko on 21.09.2017.
 */
public class TestThread {

    public static void main(String[] args) {

        TestThread testThread = new TestThread();

        for (int i = 0; i < 2; i++) {
            final Thread thread = new Thread(testThread::printStr2);
            thread.start();
        }
    }

    private void printStr(char ch) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + (char) (ch + i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private void printStr2() {
        char ch = 97;
        synchronized (this) {
            for (int j = 11; j < 20; j++) {
                System.out.println(Thread.currentThread().getName() + " " + (char) (ch + j));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        printStr(ch);
    }
}
