package vertexOOP.lesson1.classwork.bd;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Service service = new Service();

        System.out.println(Arrays.toString(service.getAll()));
        System.out.println(service.getFirst());
        System.out.println(service.getLast());
        System.out.println(Arrays.toString(service.getByName("Alex")));
        System.out.println(Arrays.toString(service.getBySurName("Smith")));

        System.out.println(service.getFirstForAge(2));

    }
}
