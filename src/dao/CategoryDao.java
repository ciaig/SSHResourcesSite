package dao;

import java.util.List;

import domain.Category;

public interface CategoryDao {
	List<Category> getAll();

	List<Category> getByMenuId(int menu);
	
}
