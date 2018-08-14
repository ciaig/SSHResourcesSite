package test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dao.ContentDao;
import dao.impl.CategoryDaoImpl;
import dao.impl.MenuDaoImpl;
import dao.impl.UserDaoImpl;
import domain.Category;
import domain.User;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test1 {
	
	@Resource(name="menuDaoImpl")
	private MenuDaoImpl mdao;
	@Resource(name="categoryDaoImpl")
	private CategoryDaoImpl cdao;
	@Resource(name="userDaoImpl")
	private UserDaoImpl udao;
	@Resource(name="contentDaoImpl")
	private ContentDao condao;
	@Test
	public void test1(){
//		List<Menu> list = mdao.getAll();
//		System.out.println(list);
		/*List<User> list2 = udao.getAll();
		System.out.println(list2);
		List<User> user = udao.getUserByName("dsa");
		System.out.println(user.size());*/
		System.out.println(condao.getBuyId(1));
	}
}
