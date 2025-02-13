package reponsitory;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {
    public void addNew(User user);

    public List<User> findAll();

    public void deleteId(int id);

    public void update(User user);

    public List<User> sort();

    public List<User> searchByCountry(String country);

    public List<User> findId(int id);

    public void updateByName(User user);

    public void deleteByName(String name);

    public void addUserTransaction(User user) throws SQLException;
}
