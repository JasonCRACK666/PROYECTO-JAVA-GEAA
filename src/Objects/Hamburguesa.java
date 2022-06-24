package Objects;

import java.util.ArrayList;

public class Hamburguesa {
	private double price = 10;
	private String size;
	private ArrayList<String> extrasList = new ArrayList<>();
	private int amount = 1;
	
	// PRICE
	public double getPrice() {
		return this.price;
	}

	public void setPriceTotal(double precio) {
		this.price = precio;
	}
	
	// SIZE
	public String getSize() {
		return this.size;
	}
	
	public void setSize(String tipo) {
		this.size = tipo;
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
	
	// AMOUNT
	public int getAmount() {
		return this.amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
