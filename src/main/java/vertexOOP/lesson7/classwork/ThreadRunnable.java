package vertexOOP.lesson7.classwork;

/**
 * @author Viktor Bilko on 18.09.2017.
 */
public class ThreadRunnable {

    public static void main(String[] args) {
        Thread thread = new Thread(new HelloRunnable());
        thread.start();

        HelloThread helloThread = new HelloThread();
        helloThread.start();
    }
    public static class HelloRunnable implements Runnable{

        @Override
        public void run() {
            System.out.println("Hello from a Runnable");
        }
    }

    public static class HelloThread extends Thread{

        @Override
        public void run() {
            System.out.println("Hello from a thread");
        }
    }
}
