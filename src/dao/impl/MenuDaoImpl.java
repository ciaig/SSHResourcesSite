package dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import dao.MenuDao;
import domain.Category;
import domain.Menu;

public class MenuDaoImpl extends HibernateDaoSupport implements MenuDao{

	@Override
	public List<Menu> getAll() {
		List<Menu> list = (List<Menu>) this.getHibernateTemplate().find("from Menu");
		return list;
	}

}
