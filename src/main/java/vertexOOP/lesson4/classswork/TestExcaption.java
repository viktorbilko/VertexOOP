package vertexOOP.lesson4.classswork;

/**
 * Created by vertex0002 on 31.08.2017.
 */
public class TestExcaption {

    public static void main(String[] args) {
        try {
            int y = sum(2,0);
            System.out.println(y);
        } catch (Exception e){
            System.out.println("wrong");
            e.printStackTrace();
            System.out.println(e.getClass().getSimpleName());
        } finally {
            System.out.println("Working");
        }
    }

    private static int sum(int i, int i1) throws  Exception {
        throw new NullPointerException();
    }

}
