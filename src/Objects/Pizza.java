package Objects;

public class Pizza {

	private double price = 15;
	private String sab = "";
	private String size = "";
	
	public Pizza(double price, String type, String size) {
		this.price += price;
		this.sab = type;
		this.size = size;
	}
	
	public String getSize() {
		return this.size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPriceTotal(double precio) {
		this.price = precio;
	}
	
	public void setType(String type) {
		this.sab = type;
	}
	
	public String getType() {
		return this.sab;
	}
	
}
