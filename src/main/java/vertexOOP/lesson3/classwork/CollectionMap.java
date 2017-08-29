package vertexOOP.lesson3.classwork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by vertex0002 on 28.08.2017.
 */
public class CollectionMap {

    public static void main(String[] args) {

        HashMap<Integer, Object> map = new HashMap<>();

        fill(map);
        print(map);

        List listUsers = sortCollectionToUser(map);
        List listProject = sortCollectionToProject(map);

        printArrayList(listUsers);
        printArrayList(listProject);
    }

    private static void printArrayList(List list) {


        System.out.println(list);
    }

    private static List<Project> sortCollectionToProject(HashMap<Integer, Object> map) {
        List listProject = new ArrayList<>();
        for (Object o : map.values()) {
            if (o instanceof Project){
                listProject.add(o);
            }
        }

        return listProject;
    }

    private static List<User> sortCollectionToUser(HashMap<Integer, Object> map) {
        List listUser = new ArrayList<>();
        for (Object o : map.values()) {
            if (o instanceof User){
                listUser.add(o);
            }
        }

        return listUser;
    }

    private static void print(HashMap<Integer, Object> map) {
        System.out.println(map.entrySet());
    }

    private static void fill(HashMap<Integer, Object> map) {
        for (int i = 0; i < 20; i++) {
            if (i < 0){
                map.put(i,new User("Alex"));
            } else  {
                map.put(i, new Project("MyProject"," 28.08.2017"));
            }
        }
    }
}
