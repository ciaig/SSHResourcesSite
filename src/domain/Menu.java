package domain;

import java.util.Set;

public class Menu {
	private int id;
	private String name;
	private Set<Category> category;
	public Menu() {
	}
	public Menu(int id, String name, Set<Category> category) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
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
	public Set<Category> getCategory() {
		return category;
	}
	public void setCategory(Set<Category> category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Meun [id=" + id + ", name=" + name + ", category=" + category + "]";
	}
	
}
