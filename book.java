package library;

public class book {
	
	private int id;
	private String name;
	private String author;
	private double price;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public book(int id, String name, String author, double price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "book [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + "]";
	}
	
	

}
