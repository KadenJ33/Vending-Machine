package com.techelevator;

import java.util.List;

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
//	String choice = myMenu.getItemChoice();
	Slot mySlot = new Slot(null, null, change, null);
	SlotsArrayList data = new SlotsArrayList();
	List<Slot> myList = data.itemFileToArrayList();
	
	
	public void doesItemExist(String choice) {
	//	MainMenu myMenu = new MainMenu();
	//	SnacksGroups myGroups = new SnacksGroups();
		// fior loop that iterates through arrayList, checks if getItemChoice exists in specific element
		for (int i = 0; i < myList.size() -1; i++) {
			if (myList.get(i).getSlot().equals(choice.toUpperCase())) {
				isItemSoldOut();
			
		} else {
			System.out.println("Invalid Item Choice");
			myMenu.displayPurchasingMenu();
		}
	}	
	}
	
	public void isItemSoldOut() {
		if (mySlot.getStockLeft() >	0) {
			isEnoughMoney();
			
		} else {
			System.out.println("Item is sold out");
			myMenu.displayPurchasingMenu();
		}
	}
	
	public void isEnoughMoney() {
		if (myMenu.inputMoney() >= mySlot.getPrice()) {
			
			change = myMenu.inputMoney() - mySlot.getPrice();
			printItemInfo();
			
		} else {
			System.out.print("You have not provided enough dollars to the snack robot");
			myMenu.inputMoney();
		}
	}
	
	public void printItemInfo() {
		Double.toString(change);
		System.out.println( mySlot.getName() + " " + mySlot.getPrice() + " " + change + "\n" + mySlot.getOutputMessage());
		
		myMenu.displayMenu();
	}
	
	
	
}