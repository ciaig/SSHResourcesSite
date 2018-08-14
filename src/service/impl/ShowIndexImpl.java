package service.impl;

import java.util.List;

import javax.annotation.Resource;

import dao.CategoryDao;
import dao.ContentDao;
import dao.MenuDao;
import domain.Category;
import domain.Content;
import domain.Menu;
import service.ShowIndex;

public class ShowIndexImpl implements ShowIndex{
	
	@Resource(name="menuDaoImpl")
	private MenuDao mdao;
	@Resource(name="categoryDaoImpl")
	private CategoryDao cdao;
	@Resource(name="contentDaoImpl")
	private ContentDao condao;
	@Override
	public List<Menu> getMeun() {
		return mdao.getAll();
	}

	@Override
	public List<Category> getCategory(int menu) {
		return cdao.getByMenuId(menu);
	}

	@Override
	public List<Content> getContent(int categoryIndex,int currentIndex) {
		return condao.getByCategory(categoryIndex,currentIndex);
	}

	@Override
	public int getCountByCategory(int categoryIndex) {
		return condao.getCountByCategory(categoryIndex);
	}
	

}
