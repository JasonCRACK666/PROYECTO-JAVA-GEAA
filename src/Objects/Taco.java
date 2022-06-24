package Objects;

import java.util.ArrayList;

public class Taco {
	private double price = 2;
	private ArrayList<String> extrasList = new ArrayList<>();
	private String sabor = "";
	
	// PRICE
	public double getPrice() {
		return this.price;
	}

	public void setPriceTotal(double precio) {
		this.price += precio;
	}
	
	// SABOR
	public String getSabor() {
		return this.sabor;
	}
	
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	// EXTRAS
	public String getExtras() {
		String extras = "";
		for (String extra : extrasList) {
			extras += extra+", ";
		}
		return extras;
	}
	
	public int getCountExtras() {
		return this.extrasList.size();
	}

	public void setExtra(String extra) {
		this.extrasList.add(extra);
	}
	
	public void deleteExtra(String extra) {
		this.extrasList.remove(String.valueOf(extra));
	}
}
