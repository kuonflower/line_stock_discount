package model;

public class NamePrice {

	private String name;
	private double price;



	public NamePrice(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}



	public NamePrice() {

	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}

}
