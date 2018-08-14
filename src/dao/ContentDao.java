package dao;

import java.util.List;

import domain.Content;

public interface ContentDao {

	List<Content> getByCategory(int categoryIndex, int currentIndex);

	int getCountByCategory(int categoryIndex);

	List<Content> getBuyId(int contentid);
	
}
