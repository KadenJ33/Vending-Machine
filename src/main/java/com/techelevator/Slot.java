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

	public void setSlot(String slot) {
		this.slot = slot;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getSnackGrouping() {
		return snackGrouping;
	}

	public void setSnackGrouping(String snackGrouping) {
		this.snackGrouping = snackGrouping;
		if (this.snackGrouping == "Chip") {
			setOutputMessage("Crunch Crunch, Yum!");
		} else if (this.snackGrouping == "Candy") {
			setOutputMessage("Munch Munch, Yum!");
		} else if (this.snackGrouping == "Drink") {
			setOutputMessage("Glug Glug, Yum!");
		} else if (this.snackGrouping == "Gum") {
			setOutputMessage("Chew Chew, Yum!");
		}
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

	public void setOutputMessage(String outputMessage) {
		this.outputMessage = outputMessage;
	}

	
	
	
	//constructor
	public Slot (String slot, String name, Double price, String snackGrouping) {
		this.slot = slot;
		this.name = name;
		this.price = price;
		this.snackGrouping = snackGrouping;
		stockLeft = 5;
	}


	

}
