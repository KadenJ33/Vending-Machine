package com.techelevator;

import java.util.List;

public class SelectProduct {
	
	double change;
	
	public double getChange() {
		return change;
	}

	MainMenu myMenu = new MainMenu();
	SlotsArrayList data = new SlotsArrayList();
	List<Slot> myList = data.itemFileToArrayList();
	
	
	public void doesItemExist(String choice) {
		boolean exists = false;
		for (int i = 0; i < myList.size(); i++) {
			if (myList.get(i).getSlot().equals(choice)) {
				isItemSoldOut(myList.get(i));
				exists = true;
		} if (exists = false) {
			System.out.println("Invalid Item Choice");	
			myMenu.displayPurchasingMenu();
			myMenu.getPurchasingMenuChoice();
		}
	}
	}
	
	public void isItemSoldOut(Slot mySlot) {
		if (mySlot.getStockLeft() >	0) {
			isEnoughMoney(mySlot);
			
		} else {
			System.out.println("Item is sold out");
			myMenu.displayPurchasingMenu();
			myMenu.getPurchasingMenuChoice();
		}
	}
	
	public void isEnoughMoney(Slot mySlot) {
		if (myMenu.getBalance() >= mySlot.getPrice()) {
			
			change = myMenu.getBalance() - mySlot.getPrice();
			printItemInfo(mySlot);
			
		} else {
			System.out.print("You have not provided enough dollars to the snack robot \n");
			myMenu.inputMoney();
			isEnoughMoney(mySlot);
		}
	}
	
	public void printItemInfo(Slot mySlot) {
		Double.toString(change);
		System.out.println( mySlot.getName() + " " + mySlot.getPrice() + " " + change + "\n" + mySlot.getOutputMessage());
		
		myMenu.displayMenu();
		myMenu.getMainMenuChoice();
	}
	
	
	
}