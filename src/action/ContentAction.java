package action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import service.ContentService;

public class ContentAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private String contentid="1";
	@Resource(name="contentService")
	private ContentService contentService;
	@Override
	public String execute() throws Exception {
		int contentid=Integer.parseInt(this.contentid);
		ActionContext.getContext().getSession().put("contentid", contentid);
		switch(contentService.getMenu(contentid)){
		case 1:
			return "picture";
		case 2:
			return "music";
		case 3:
			return "video";
		case 4:
			return "other";
		default:
			return ERROR;
		}
		
	}
	
	public String picture(){
		int contentid=Integer.parseInt(ActionContext.getContext().getSession().get("contentid").toString());
		String url=contentService.getURL(contentid);
		if(url==null){
			return ERROR;
		}
		ActionContext.getContext().getSession().put("imgurl", url);
		return SUCCESS;
	}
	
	public void setContentid(String contentid) {
		this.contentid = contentid;
	}
	
}
