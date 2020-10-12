package com.techelevator;

import java.text.DecimalFormat;
import java.util.List;

public class SelectProduct {
	
	double newMoney = MainMenu.getBalance();
	double change;
	
	
	
	
	MainMenu myMenu = new MainMenu();

	
	
	public void doesItemExist(String choice, List<Slot> myList) {
		
		
		for (int i = 0; i < myList.size(); i++) {
			if (myList.get(i).getSlot().equals(choice)) {
				isItemSoldOut(myList.get(i));
			}		
		}	if ((myList.get(myList.size()-1).getSlot()) != choice) {
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
		DecimalFormat df = new DecimalFormat("0.00");
		Double oldMoney = 0.0;
		
		if (newMoney >= mySlot.getPrice()) {
			

			change = newMoney - mySlot.getPrice();
			MainMenu.setBalance(change);

			oldMoney = newMoney;
			newMoney = newMoney - mySlot.getPrice();
			newMoney = Double.parseDouble(df.format(newMoney));
			myMenu.logAction(mySlot.getSlot() +  "| " + mySlot.getName(), oldMoney, newMoney);
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

	
		System.out.println("\n" + mySlot.getName() + " " + mySlot.getPrice() + " " + change + "\n" + mySlot.getOutputMessage() + "\n");
		
		
	

		
		myMenu.displayPurchasingMenu();
		myMenu.getPurchasingMenuChoice();
	}
	
	
	
	
	
}