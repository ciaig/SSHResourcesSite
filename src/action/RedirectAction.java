package action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;

import service.ShowIndex;

public class RedirectAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	@Resource(name="showIndexService")
	private ShowIndex showService;
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
}
