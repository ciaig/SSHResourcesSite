package service;

import java.util.List;

import domain.Category;
import domain.Content;
import domain.Menu;

public interface ShowIndex {

	List<Menu> getMeun();

	List<Category> getCategory(int menu);

	List<Content> getContent(int categoryIndex,int currentIndex);

	int getCountByCategory(int categoryIndex);

}
