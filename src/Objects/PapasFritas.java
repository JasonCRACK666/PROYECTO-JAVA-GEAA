package Objects;

public class PapasFritas {
	
	private String size;
	private double price = 6;
	
	public PapasFritas(String tm, double precio) {
		this.size = tm;
		this.price += precio;
	}
	
	public String getSize() {
		return this.size;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
}
