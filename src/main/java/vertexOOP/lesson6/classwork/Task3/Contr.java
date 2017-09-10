package vertexOOP.lesson6.classwork.Task3;

import lombok.Builder;

/**
 * Created by vertex0002 on 07.09.2017.
 */
@Builder
public class Contr {
    public static void main(String[] args) {
        Serv serv = name -> System.out.println(name);
        serv.add("fd");
    }
}
