package vertexOOP.lesson3.classwork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by vertex0002 on 28.08.2017.
 */
public class Test {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 5; i < 15; i++) {
            list.add(i);
        }

        System.out.println(list);

        Iterator<Integer> iter = list.iterator();


        while (iter.hasNext()){
            int element = iter.next();
            if (element%2 == 0){
                System.out.println(element);
            } else {
                iter.remove();
            }
        }

        System.out.println(list);
    }
}
