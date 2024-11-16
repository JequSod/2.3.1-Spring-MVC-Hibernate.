package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    public List<User> getAllUser();

    public User getUser(long id);

    public void removeUser(long id);

    public void save(User user);
}
