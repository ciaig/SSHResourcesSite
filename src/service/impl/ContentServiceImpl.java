package service.impl;

import java.util.List;

import javax.annotation.Resource;

import dao.ContentDao;
import domain.Content;
import service.ContentService;

public class ContentServiceImpl implements ContentService{
	
	@Resource(name="contentDaoImpl")
	private ContentDao condao;
	
	@Override
	public int getMenu(int contentid) {
		List<Content> list = condao.getBuyId(contentid);
		if(list.size()==0){
			return 0;
		}
		return list.get(0).getCategory().getMenu().getId();
	}

	@Override
	public String getURL(int contentid) {
		List<Content> list = condao.getBuyId(contentid);
		if(list.size()==0){
			return null;
		}
		return list.get(0).getImgurl();
	}
	
}
