package service.impl;

import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import dao.UserDao;
import domain.User;
import service.UserService;
@Transactional(rollbackFor=Exception.class)
public class UserServiceImpl implements UserService {

	@Resource(name="userDaoImpl")
	private UserDao userdao; 
	@Override
	public boolean registe(User user) {
		boolean flag=false;
		if((userdao.getUserByName(user.getUsername())).size()==0){
			user.setActiveCode(UUID.randomUUID().toString());
			userdao.save(user);
			flag=true;
		}
		return flag;
	}
	@Override
	public boolean login(User user,Map<String, Object> map) {
		boolean flag=false;
		if((userdao.getUserLogin(user.getUsername(),user.getPassword())).size()!=0){
			map.put("LOGIN", user);
			flag=true;
		}
		return flag;
	}
}
