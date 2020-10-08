package com.techelevator;

import java.math.BigDecimal;
import java.util.Scanner;

public class MainMenu {
	Scanner ourScanner = new Scanner(System.in);

	public void displayMenu() {
		System.out.println("Please choose an option:  ");
		System.out.println("(1) Display vending machine items.");
		System.out.println("(2) Display purchasing menu.");
		System.out.println("(3) Exit");
	}
	
	public String getMainMenuChoice() {

		String userInput = ourScanner.nextLine();
		
		if (userInput.equals("1")) {
			System.out.println("1");
			
			
		} else if (userInput.equals("2")){
			displayPurchasingMenu();
			getPurchasingMenuChoice();
			
			
			System.out.println("2");
		} else if (userInput.equals("3")) {
			System.out.println("Exiting");
			System.exit(1);
		} else {
			System.out.println("Please enter one of the options.");
			displayMenu();
			getMainMenuChoice();
		}	
		
		return userInput;
	}
	
	
	
	public void displayPurchasingMenu() {
		System.out.println("Please choose an option:  ");
		System.out.println("(1) Insert money.");
		System.out.println("(2) Select Product.");
		System.out.println("(3) Finish Transaction.");
		
	}

	
	
	public String getPurchasingMenuChoice() {

		String userInput = ourScanner.nextLine();
		
		if (userInput.equals("1")) {
			inputMoney();
			
			
		} else if (userInput.equals("2")){
			
			
		} else if (userInput.equals("3")) {

			
			
		} else {
			System.out.println("Please enter one of the options.");
			displayPurchasingMenu();
			getPurchasingMenuChoice();
		}	
		
		return userInput;
	}
	
	public Double inputMoney() {
	
		Double balance = 0.0;
		Boolean finishedInputtingMoney = false;

		
		while (finishedInputtingMoney == false) {
			System.out.println("Please enter a valid dollar amount.  Enter X to finish");
			String userInput = ourScanner.nextLine();

		if (userInput.equals("1")) {
			balance += 1;
			System.out.println(balance);
			
		} else if (userInput.equals("2")){			
			balance += 2;
			System.out.println(balance);
		} else if (userInput.equals("5")) {
			balance += 5;
			System.out.println(balance);
		} else if (userInput.equals("10")) {
			balance += 10;
			System.out.println(balance);
		} else {
			finishedInputtingMoney = true;
		}
		} 
		
		return balance;
	}
	
	
}
