package com.techelevator;

// get list items
// find specific items
// confirm if sold out or not, if it is return to purchase menu
// see if price is less than or equal to balance
// dispense item print message
// update balance, return to purchase menu

public class SelectProduct {
	
	double change;
	
// DISCLAIMER: MUCH OF THIS MAY BE INCORRECT, I ATTEMPTED TO AT LEAST START A FRAMEWORK
// THAT CAN BE FULLY REALIZED TOMORROW
	
	
	public double getChange() {
		return change;
	}

	MainMenu myMenu = new MainMenu();
	SnackGroups myGroups = new SnackGroups();

	
	public void doesItemExist() {
	//	MainMenu myMenu = new MainMenu();
	//	SnacksGroups myGroups = new SnacksGroups();
		if (myMenu.getItemChoice().equals(myGroups.getSlot())) {
			
			isItemSoldOut();
			
		} else {
			myMenu.displayPurchasingMenu();
		}
	}
	
	public void isItemSoldOut() {
		if (myGroups.getStockLeft() > 0) {
			
			isEnoughMoney();
			
		} else {
			myMenu.displayPurchasingMenu();
		}
	}
	
	public void isEnoughMoney() {
		if (myMenu.inputMoney() >= myGroups.getPrice()) {
			
			change = myMenu.inputMoney() - myGroups.getPrice();
			printItemInfo();
			
		} else {
			System.out.print("You have not provided enough dollars to the snack robot");
			myMenu.inputMoney();
		}
	}
	
	public void printItemInfo() {
		Double.toString(change);
		System.out.println( myGroups.getName() + " " + myGroups.getPrice() + " " + change + "\n" + myGroups.getMessage);
		
		myMenu.displayMenu();
	}
	
	
	
}