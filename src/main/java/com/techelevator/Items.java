package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Items {
	
	//instance variables
	int numRemaining = 5;
	
	//getters and setters
	
	
	//constructor
	public void itemsRemaining() {
		
		
	}
	
	//methods
	public void displayItems() {
		
		
		File inputFile = new File("vendingmachine.csv");
		try (Scanner itemFile = new Scanner(inputFile)){
			while (itemFile.hasNextLine()) {
				String fileLine = itemFile.nextLine();
				System.out.println(fileLine + " - Only " + numRemaining + " remaining!");
		}
			} catch(FileNotFoundException fnfe) {
				System.out.println("Error!");
			}
			
			
			
		
	}
}
	
	
	
	


