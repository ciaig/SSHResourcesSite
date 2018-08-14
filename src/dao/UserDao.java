package dao;

import java.util.List;

import domain.User;

public interface UserDao {
	List<User> getAll();

	List<User> getUserByName(String username);

	void save(User user);

	List<User> getUserLogin(String username, String password);
}
