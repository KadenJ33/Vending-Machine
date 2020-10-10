package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Scanner;

public class MainMenu {
	private String itemChoice;
	static double balance = 0.0;
	public String getItemChoice() {
		return itemChoice;
	}

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
			//SlotsArrayList itemList = new SlotsArrayList();
			//String[] output = itemList.itemFileToArray();
			//for (int i = 0; i < output.length; i++) {
			//	System.out.println(output[i]);
			//}
		//	System.out.println(output);
			getMainMenuChoice();
			
			
		} else if (userInput.equals("2")){
			displayPurchasingMenu();
			getPurchasingMenuChoice();
			 
			
			System.out.println("2");
		} else if (userInput.equals("3")) {
			System.out.println("Exiting");
			System.exit(1);
			
		} else if (userInput.contentEquals("4")) {
			
			
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

	
	
	public void getPurchasingMenuChoice() {

		String userInput = ourScanner.nextLine();
		
		if (userInput.equals("1")) {
			inputMoney();
			displayPurchasingMenu();
			getPurchasingMenuChoice();
			
		} else if (userInput.equals("2")){
			System.out.println("Please enter your selection: ");
			SelectProduct snackTime = new SelectProduct();
			itemChoice = ourScanner.nextLine();
			snackTime.doesItemExist(itemChoice);
			
			
		} else if (userInput.equals("3")) {
			System.out.println("Please wait while we process your transaction...");
			
			FinishTransaction ft = new FinishTransaction();
			ft.getChangeReturned();

				
			
		} else {
			System.out.println("Please enter one of the options.");
			displayPurchasingMenu();
			getPurchasingMenuChoice();
		}	
	
	//	return userInput;
	}

	public Double inputMoney() {
		Double balance = 0.0;
		Double moneyAdded = 0.0;
		
		Boolean finishedInputtingMoney = false;

		
		while (finishedInputtingMoney == false) {
			System.out.println("Please enter a valid dollar amount.  Enter X to finish");
			String userInput = ourScanner.nextLine();


		if (userInput.equals("1") || userInput.equals("1.0") || userInput.equals("1.00")) {
			this.balance += 1;
			moneyAdded = 1.00;
			System.out.println(this.balance);
		} else if (userInput.equals("2") || userInput.equals("2.0") || userInput.equals("2.00")){			
			this.balance += 2;
			moneyAdded = 2.00;
			System.out.println(this.balance);
		} else if (userInput.equals("5") || userInput.equals("5.0") || userInput.equals("5.00")) {
			this.balance += 5;
			moneyAdded = 5.00;
			System.out.println(this.balance);
		} else if (userInput.equals("10") || userInput.equals("10.0") || userInput.contentEquals("10.00")) {
			this.balance += 10;
			moneyAdded = 10.00;
			System.out.println(this.balance);

		} else {
			finishedInputtingMoney = true;
		} 
		
		logAction("FEED MONEY", moneyAdded, balance);
		
		}
		return this.balance;
		
	}
	
	
	public void logAction(String action, double moneyAdded, double balance) {
		String newPath = System.getProperty("user.dir");
		String fileName = "log.txt";
		File log = new File(newPath, fileName);
		try {
			log.createNewFile();
		} catch (IOException e) {
			System.out.println("Error!");
		}
		
		
		try (PrintWriter pw = new PrintWriter(new FileWriter(log, true))) {
			
			pw.println(LocalDateTime.now() + " " + action + " " + moneyAdded + " " +  balance);
			
		}catch(IOException e) {
			System.out.println("Error!");
		} 
	}
	public static double getBalance() {
		return balance;
	}

	public static void setBalance(double balance) {
		MainMenu.balance = balance;
	}

	
	
	
}


	
	

