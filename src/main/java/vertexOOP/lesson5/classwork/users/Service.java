package vertexOOP.lesson5.classwork.users;

import vertexOOP.lesson5.classwork.users.impl.UserPrinterImpl;
import vertexOOP.lesson5.classwork.users.impl.UserWriterImpl;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by vertex0002 on 04.09.2017.
 */
public class Service {

    public static void main(String[] args) throws IOException {

        User alex = new User("Alex",25, "football");
        User bob = new User("Bob",22, "football");
        User tom = new User("Tom",21, "swim");


        List<User> list = new LinkedList<>();

        list.add(alex);
        list.add(bob);
        list.add(tom);

        UserWriter userWriter = new UserWriterImpl();
        userWriter.save(list);

        UserPrinter userPrinter = new UserPrinterImpl();
        userPrinter.print();
    }
}
