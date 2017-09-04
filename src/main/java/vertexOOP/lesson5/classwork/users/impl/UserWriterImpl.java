package vertexOOP.lesson5.classwork.users.impl;

import vertexOOP.lesson5.classwork.users.User;
import vertexOOP.lesson5.classwork.users.UserWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created by vertex0002 on 04.09.2017.
 */
public class UserWriterImpl implements UserWriter {

    String filePath = "src/main/resources/fileUser.txt";
    
    @Override
    public void save(List<User> list) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,true));

        for (User user : list) {
            writer.write("User number: "
                    +user.getId()
                    +"\n"
                    + "username: "
                    + "\n"
                    + "age: "
                    + user.getAge()
                    + "\n"
                    + "hobby: "
                    + user.getHobby()
                    + "\n"
                    +"\n"
            );
        }
        writer.flush();
        writer.close();
    }
}
