package action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import domain.Category;
import domain.Content;
import domain.Menu;
import service.ShowIndex;

public class IndexAction extends ActionSupport{
	private String menuIndex="1";
	private String categoryIndex="1";
	private String currentIndex="1";
	private static final long serialVersionUID = 1L;
	@Resource(name="showIndexService")
	private ShowIndex showService;
	public String showIndex() throws Exception {
		int index = Integer.parseInt(menuIndex);
		List<Menu> menu = showService.getMeun();
		List<Category> category = showService.getCategory(index);
		List<Content> content = showService.getContent(category.get(0).getId(),1);
		HttpSession session = ServletActionContext.getRequest().getSession();
		int count=showService.getCountByCategory(category.get(0).getId());
		int totalPage=(count%9==0)?(count/9):(count/9+1);
		session.setAttribute("allMenu", menu);
		session.setAttribute("allCategory",category);
		session.setAttribute("allContent",content);
		session.setAttribute("totalPage",totalPage);
		session.setAttribute("currentCategory", category.get(0).getId());
		session.setAttribute("currentIndex", 1);
		return SUCCESS;
	}
	public String showContent() throws Exception {
		int categoryIndex = Integer.parseInt(this.categoryIndex);
		int currentIndex=Integer.parseInt(this.currentIndex);
		int count=showService.getCountByCategory(categoryIndex);
		int totalPage=(count%9==0)?(count/9):(count/9+1);
		List<Content> content = showService.getContent(categoryIndex,currentIndex);
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.setAttribute("allContent",content);
		session.setAttribute("totalPage",totalPage);
		session.setAttribute("currentCategory", this.categoryIndex);
		session.setAttribute("currentIndex",currentIndex);
		return SUCCESS;
	}
	public void setMenuIndex(String menuIndex) {
		this.menuIndex = menuIndex;
	}
	public void setCategoryIndex(String categoryIndex) {
		this.categoryIndex = categoryIndex;
	}
	public void setCurrentIndex(String currentIndex) {
		this.currentIndex = currentIndex;
	}
	
	
}
