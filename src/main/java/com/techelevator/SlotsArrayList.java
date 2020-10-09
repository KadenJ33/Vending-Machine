package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SlotsArrayList {
	
	//instance variables
	int numRemaining = 5;
	
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

	
	
	public List<Slot> itemFileToArrayList() {
		
		//declare arrays to hold split values
		
		//gets the txt file ready
		File inputFile = new File("vendingmachine.csv");
		//creates a bucket variable to hold the values from splitter later
		String[] readInValueHolder = new String[4];			
		//creates the arrayList that will hold all the slots
		List<Slot> vendingMachineList = new ArrayList<>();
			
		
		
		//try for error checking
		try (Scanner itemFile = new Scanner(inputFile)){
			//while loop that runs through the lines of the txt file
			while (itemFile.hasNextLine()) {
				
			//splits the current line from the txt file and stores the seperate values in an array
				readInValueHolder = itemFile.nextLine().split("|");
				//creates a new slot and passes in the values from the split array into the constructor then adds it to the list
				Slot vendingMachineSlot = new Slot(readInValueHolder[0],readInValueHolder[1],Double.parseDouble(readInValueHolder[2]),readInValueHolder[3]);
				vendingMachineList.add(vendingMachineSlot);

				
				}
			//error catching
			} catch(FileNotFoundException fnfe) {
				System.out.println("Error!");
	} return vendingMachineList;
}
}
	
	
	


