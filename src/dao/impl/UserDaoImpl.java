package dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import dao.UserDao;
import domain.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	@Override
	public List<User> getAll() {
		List<User> list = (List<User>) this.getHibernateTemplate().find("from User");
		return list;
	}

	@Override
	public List<User> getUserByName(String username) {
		List<User> list = (List<User>) this.getHibernateTemplate().find("from User where username=?0",username);
		return list;
	}

	@Override
	public void save(User user) {
		this.getHibernateTemplate().save(user);
	}

	@Override
	public List<User> getUserLogin(String username, String password) {
		List<User> list = (List<User>) this.getHibernateTemplate().find("from User where username=?0 and password=?1",username,password);
		return list;
	}

	

}
