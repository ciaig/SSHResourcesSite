package action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.User;
import service.UserService;

public class UserAction extends ActionSupport implements ModelDriven<User>{
	@Resource(name="userService")
	private UserService userservice;
	private User user=new User();
	private static final long serialVersionUID = 1L;
	
	public String registe(){
		if(user.getUsername().equals("")){
			ActionContext.getContext().getValueStack().set("msg", "用户名不能为空");
			return ERROR;
		}else if(user.getPassword().equals("")){
			ActionContext.getContext().getValueStack().set("msg", "密码不能为空");
			return ERROR;
		}else if(user.getPassword().length()<6){
			ActionContext.getContext().getValueStack().set("msg", "密码不能小于六位");
			return ERROR;
		}else if(userservice.registe(user)){
			ActionContext.getContext().getValueStack().set("msg", user.getUsername());
			return SUCCESS;
		}
		else{
			ActionContext.getContext().getValueStack().set("msg", "用户名已存在");
			return ERROR;
		}
	}
	public String loginUser(){
		if(userservice.login(user,ActionContext.getContext().getSession())){
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
	public String quit(){
		ActionContext.getContext().getSession().put("LOGIN",null);
		return SUCCESS;
	}
	@Override
	public User getModel() {
		return user;
	}

}
