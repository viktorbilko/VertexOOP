package vertexOOP.lesson5.classwork.users;

/**
 * Created by vertex0002 on 04.09.2017.
 */
public class User {

    private int id;
    private String name;
    private int age;
    private String hobby;

    public User() {
    }

    public User(String name, int age, String hobby) {

        this.name = name;
        this.age = age;
        this.hobby = hobby;
        this.id++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
