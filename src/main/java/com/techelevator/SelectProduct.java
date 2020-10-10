package com.techelevator;

import java.util.List;

public class SelectProduct {
	
	double newMoney = MainMenu.getBalance();
	
	double change;
	
	public double getChange() {
		return change;
	}

	MainMenu myMenu = new MainMenu();
	SlotsArrayList data = new SlotsArrayList();
	List<Slot> myList = data.itemFileToArrayList();
	
	
	public void doesItemExist(String choice) {
		
	//	boolean exists = true;
		
		for (int i = 0; i < myList.size(); i++) {
			if (myList.get(i).getSlot().equals(choice)) {
				isItemSoldOut(myList.get(i));
			}		
		}  if ((myList.get(myList.size()-1).getSlot()) != choice) {
			System.out.println("\n Invalid Item Choice \n");	
			myMenu.displayMenu();
			myMenu.getMainMenuChoice();
		}
	}
	
	
	public void isItemSoldOut(Slot mySlot) {
		if (mySlot.getStockLeft() >	0) {
			isEnoughMoney(mySlot);
			
		} else {
			System.out.println("\n Item is sold out \n");
			myMenu.displayPurchasingMenu();
			myMenu.getPurchasingMenuChoice();
		}
	}
	
	public void isEnoughMoney(Slot mySlot) {
		if (newMoney >= mySlot.getPrice()) {
			
			newMoney = newMoney - mySlot.getPrice();
			MainMenu.setBalance(newMoney);
			printItemInfo(mySlot);
			
		} else {
			System.out.print("\n You have not provided enough dollars to the snack robot \n");
			myMenu.inputMoney();
			System.out.println("\n Please reselect your choice \n");
			myMenu.displayPurchasingMenu();
			myMenu.getPurchasingMenuChoice();
		}
	}
	
	public void printItemInfo(Slot mySlot) {
		Double.toString(change);
		System.out.println("\n" + mySlot.getName() + " " + mySlot.getPrice() + " " + newMoney + "\n" + mySlot.getOutputMessage() + "\n");
		
		myMenu.displayMenu();
		myMenu.getMainMenuChoice();
	}
	
	
	
}