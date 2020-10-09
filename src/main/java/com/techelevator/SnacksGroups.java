package com.techelevator;

public class SnacksGroups {

	//instance variables
	private String slot;
	private String name;
	private Double price;
	private String snackGrouping;
	private int stockLeft;
	
	
	//getters and setters
	public int getStockLeft() {
		return stockLeft;
	}
	public void setStockLeft(int stockLeft) {
		this.stockLeft = stockLeft;
	}
	public String getSlot() {
		return slot;
	}
	public String getName() {
		return name;
	}
	public Double getPrice() {
		return price;
	}
	public String getSnackGrouping() {
		return snackGrouping;
	}
	
	
	//constructor
	public SnacksGroups (String slot, String name, Double price, String snackGrouping) {
		this.slot = slot;
		this.name = name;
		this.price = price;
		this.snackGrouping = snackGrouping;
		stockLeft = 5;
		
	}
	
	
}
