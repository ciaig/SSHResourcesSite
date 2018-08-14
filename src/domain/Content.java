package domain;

public class Content {
	private int id;
	private String name;
	private String imgurl;
	private Category category;
	public Content() {
	}
	public Content(int id, String name, String imgurl, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.imgurl = imgurl;
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
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Content [id=" + id + ", name=" + name + ", imgurl=" + imgurl + ", category=" + category.getId() + "]";
	}
	
}
