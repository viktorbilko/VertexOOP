package vertexOOP.lesson2.classwork;

/**
 * Created aray Users
 */
public class MainUser {

    public static void main(String[] args) {

        User user = new User();
        user.setName("Alex");
        user.setSurname("Smith");
        user.setAge(30);

        User user1 = new User("Bob","Kock",25);

        User [] users = new User[2];
        users[0] = user;
        users[1] = user1;

        print(users);
    }

    private static void print(User[] users) {
        for (User user : users) {
            System.out.println("Name: " + user.getName() + " Surname: " + user.getSurname() + " age: " + user.getAge());
        }
    }
}
