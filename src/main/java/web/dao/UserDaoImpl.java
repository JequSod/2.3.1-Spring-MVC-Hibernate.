package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public User getUser(long id) {
        return entityManager.find(User.class, id);
    }

    public void save(User user) {
        if (user.getId() != 0) {
            entityManager.merge(user);
        } else {
            entityManager.persist(user);
        }
    }

    @Override
    public List<User> getAllUser() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    public void removeUser(long id) {
        entityManager.remove(getUser(id));
        entityManager.flush();
    }
}
