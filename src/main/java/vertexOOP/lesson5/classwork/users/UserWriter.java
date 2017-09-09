package vertexOOP.lesson5.classwork.users;

import java.io.IOException;
import java.util.List;

/**
 * Created by vertex0002 on 04.09.2017.
 */
public interface UserWriter {

    void save(List<User> list) throws IOException;

}
