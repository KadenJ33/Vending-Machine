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
			Items itemList = new Items();
			String[] output = itemList.itemFileToArray();
			for (int i = 0; i < output.length; i++) {
				System.out.println(output[i]);
			}
		//	System.out.println(output);
			getMainMenuChoice();
			
			
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
			displayPurchasingMenu();
			getPurchasingMenuChoice();
			
		} else if (userInput.equals("2")){
			System.out.println("Please enter your selection: ");
			itemChoice = ourScanner.nextLine();
			
		} else if (userInput.equals("3")) {

			
			
		} else {
			System.out.println("Please enter one of the options.");
			displayPurchasingMenu();
			getPurchasingMenuChoice();
		}	
		
		return userInput;
	}
	Double balance = 0.0;
	Double moneyAdded = 0.0;
	public Double inputMoney() {
	
		
		Boolean finishedInputtingMoney = false;

		
		while (finishedInputtingMoney == false) {
			System.out.println("Please enter a valid dollar amount.  Enter X to finish");
			String userInput = ourScanner.nextLine();

		if (userInput.equals("1")) {
			balance += 1;
			moneyAdded +=1;
			System.out.println(balance);
			logAction();
			moneyAdded = 0.0;
		} else if (userInput.equals("2")){			
			balance += 2;
			System.out.println(balance);
			logAction();
		} else if (userInput.equals("5")) {
			balance += 5;
			System.out.println(balance);
			logAction();
		} else if (userInput.equals("10")) {
			balance += 10;
			System.out.println(balance);
			logAction();
		} else {
			finishedInputtingMoney = true;
		} 
		}
		return balance;
		
	}
	
	
	public void logAction() {
		String newPath = System.getProperty("user.dir");
		String fileName = "log.txt";
		File log = new File(newPath, fileName);
		try {
			log.createNewFile();
		} catch (IOException e) {
			System.out.println("Error!");
		}
		
		
		try (PrintWriter pw = new PrintWriter(new FileWriter(log, true))) {
			
			pw.println(LocalDateTime.now() + " " + "FEED MONEY" + " " + moneyAdded + " " +  balance);
			
		}catch(IOException e) {
			System.out.println("Error!");
		} 
	}
	

	
	
	
}


	
	

