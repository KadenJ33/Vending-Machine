package com.techelevator;

public class Slot {

	//instance variables
	private String slot;
	private String name;
	private Double price;
	private String snackGrouping;
	private int stockLeft;
	private String outputMessage;
	
	
	
	//getters and setters
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

	public void setSnackGrouping(String snackGrouping) {
		this.snackGrouping = snackGrouping;

	}

	public int getStockLeft() {
		return stockLeft;
	}

	public void setStockLeft(int stockLeft) {
		this.stockLeft = stockLeft;
	}

	public String getOutputMessage() {
		return outputMessage;
	}


	
	
	
	//constructor
	public Slot (String slot, String name, Double price, String snackGrouping) {
		this.slot = slot;
		this.name = name;
		this.price = price;
		this.snackGrouping = snackGrouping;
		stockLeft = 5;
		if (this.snackGrouping == "Chip") {
			outputMessage = ("Crunch Crunch, Yum!");
		} else if (this.snackGrouping == "Candy") {
			outputMessage = ("Munch Munch, Yum!");
		} else if (this.snackGrouping == "Drink") {
			outputMessage = ("Glug Glug, Yum!");
		} else if (this.snackGrouping == "Gum") {
			outputMessage = ("Chew Chew, Yum!");
		}
	}


	

}
