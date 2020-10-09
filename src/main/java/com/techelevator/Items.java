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

	
	
	public String[] itemFileToArray() {
		
		//declare arrays to hold split values
		File inputFile = new File("vendingmachine.csv");
		String[] readInValueHolder = new String[4];
		
		
		//this reads the file to get the number of lines, this needs to be done before the array can be created
		int lengthOfArray = 0;
		try (Scanner itemFile = new Scanner(inputFile)){
			while (itemFile.hasNextLine()) {
				lengthOfArray += 1;
			}
		} catch(FileNotFoundException fnfe) {
			System.out.println("Error!");
}
				
				
		Slot[] itemsList = new Slot[lengthOfArray];
		

		
		int i = 0;
		try (Scanner itemFile = new Scanner(inputFile)){
			while (itemFile.hasNextLine()) {
				
			
				readInValueHolder = itemFile.nextLine().split("|");
				Slot vendingMachineSlot = new Slot(readInValueHolder[0],readInValueHolder[1],Double.parseDouble(readInValueHolder[2]),readInValueHolder[3]);
	
				
				
				}
			} catch(FileNotFoundException fnfe) {
				System.out.println("Error!");
	} return readInValueHolder;
}
}
	
	
	


