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
		String[] readInValueHolder = new String[4];
		Slot A1 = new Slot("","",0.0,"");
		Slot A2 = new Slot("","",0.0,"");
		Slot A3 = new Slot("","",0.0,"");
		Slot A4 = new Slot("","",0.0,"");
		Slot B1 = new Slot("","",0.0,"");
		Slot B2 = new Slot("","",0.0,"");
		Slot B3 = new Slot("","",0.0,"");
		Slot B4 = new Slot("","",0.0,"");
		Slot C1 = new Slot("","",0.0,"");
		Slot C2 = new Slot("","",0.0,"");
		Slot C3 = new Slot("","",0.0,"");
		Slot C4 = new Slot("","",0.0,"");
		Slot D1 = new Slot("","",0.0,"");
		Slot D2 = new Slot("","",0.0,"");
		Slot D3 = new Slot("","",0.0,"");
		Slot D4 = new Slot("","",0.0,"");
		
		Slot[] itemsList = new Slot[]{A1, A2, A3, A4, B1, B2, B3, B4, C1, C2, C3, C4, D1, D2, D3, D4};
		
		
		
		
		
		// String[] slot = new String[16];
		// String[] name = new String[16];
		// String[] price = new String[16];
		// String[] snackGrouping = new String[16];
		
		 
		 
		//String[] output = new String[16];
		File inputFile = new File("vendingmachine.csv");
		
		
		
		
		int i = 0;
		try (Scanner itemFile = new Scanner(inputFile)){
			while (itemFile.hasNextLine()) {

				
				
				readInValueHolder = itemFile.nextLine().split("|");
				
				itemsList[i] = itemsList[i].setSlot(readInValueHolder[0]);
				//make an instance of snackGroups
		//		Slot potatoCrisps = new Slot(readInValueHolder[0],readInValueHolder[1],Double.parseDouble(readInValueHolder[2]),readInValueHolder[3]);
				
				
				
				
					//i++;
					//output[i] = itemFile.nextLine();

				
				}
			} catch(FileNotFoundException fnfe) {
				System.out.println("Error!");
	} return output;
}
}
	
	
	


