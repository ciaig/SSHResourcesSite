package dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import dao.CategoryDao;
import domain.Category;

public class CategoryDaoImpl extends HibernateDaoSupport implements CategoryDao{

	@Override
	public List<Category> getAll() {
		List<Category> list = (List<Category>) this.getHibernateTemplate().find("from Category");
		return list;
	}

	@Override
	public List<Category> getByMenuId(int menu) {
		List<Category> list = (List<Category>) this.getHibernateTemplate().find("from Category where menu_id=?0",menu);
		return list;
	}

}
