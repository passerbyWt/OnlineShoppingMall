package dao;
import java.util.List;
import entity.User;
public interface UserDAO {
    void add(User user);
    User getUserByName(String name);
    User getUserById(int id);
    void deleteById(int id);
    void update(User user);
    List<User> getAll();
}
