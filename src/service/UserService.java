package service;

import java.util.Map;

import domain.User;

public interface UserService {

	boolean registe(User user);

	boolean login(User user, Map<String, Object> map);

}
