package com.techelevator;

import java.text.DecimalFormat;

public class FinishTransaction extends SelectProduct{
		
	
	SelectProduct currentChange = new SelectProduct();
	MainMenu pullFromMain = new MainMenu();
	
	double change = MainMenu.getBalance();
	double newBalance = MainMenu.getBalance();
	
	
	
	DecimalFormat df = new DecimalFormat("0.00");
	public void getChangeReturned() {
	double nickel = .05;
	double dime = .10;
	double quarter = .25;
	int numNickel = 0;
	int numDime = 0;
	int numQuarter = 0;
	
	
	
	pullFromMain.logAction("GIVE CHANGE", change = Double.parseDouble(df.format(change)), 0.00);
	if(change == 0) {
		System.out.println("You don't get any change.");
		System.out.println("Transaction Complete!");
		
	} else {
	while(change != 0 || change == newBalance) {
		 
		while (change >= quarter) {
			change -= quarter;
			numQuarter += 1;
	        change = Double.parseDouble(df.format(change));
	     }
		
        System.out.println("Change: " + numQuarter + " quarter(s)...");
		
		
		if(change >= dime){
			while (change >= dime) {
				change -= dime;
				numDime += 1;
		        change = Double.parseDouble(df.format(change));
		     }
	         System.out.println("Change: " + numDime + " dime(s)...");
	         
	         
	     } if(change >= nickel){
				while (change >= nickel) {
					change -= nickel;
					numNickel += 1;
			        change = Double.parseDouble(df.format(change));
			     }
	         System.out.println("Change: " + numNickel + " nickel(s).");
	        
	         change = (double)change;
	     }
		
		
		}
		System.out.println("Transaction Complete!");
		System.out.println("Exiting...");
		System.exit(1);
	}
	//pullFromMain.logAction("GIVE CHANGE", change, MainMenu.getBalance());
	}
	
	
	

} 
