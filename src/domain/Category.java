package domain;

import java.util.Set;

public class Category {
	private int id;
	private String name;
	private Menu menu;
	private Set<Content> content;
	public Category() {
	}
	
	public Category(int id, String name, Menu meun) {
		super();
		this.id = id;
		this.name = name;
		this.menu = meun;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu meun) {
		this.menu = meun;
	}
	
	public Set<Content> getContent() {
		return content;
	}

	public void setContent(Set<Content> content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", menu=" + menu.getId() + ", content=" + content + "]";
	}

	
	
}
