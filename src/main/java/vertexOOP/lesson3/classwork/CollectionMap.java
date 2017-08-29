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
        System.out.println(map);

        List <User> listUsers = sortCollectionToUser(map);
        List <Project> listProject = sortCollectionToProject(map);

        System.out.println(listUsers.size());
        printListUser(listUsers);
        printListProject(listProject);
    }

    private static void printListProject(List<Project> listProject) {
        for (Project project : listProject) {
            System.out.println("Project name: " + project.getName() + ", start date: " + project.getStartDate());
        }
    }

    private static void printListUser(List<User> listUsers) {
        for (User listUser : listUsers) {
            System.out.println("Name user: " + listUser.getName());
        }
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

    private static void fill(HashMap<Integer, Object> map) {
        for (int i = 0; i < 20; i++) {
            if (i < 10){
                map.put(i,new User("Alex"+ i));
            } else  {
                map.put(i, new Project("MyProject" + " " + i," 28.08.2017"));
            }
        }
    }
}
