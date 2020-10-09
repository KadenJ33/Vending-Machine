package com.techelevator;

public class FinishTransaction{
	
	SelectProduct currentChange = new SelectProduct();
	MainMenu pullFromMain = new MainMenu();
	
	double change = currentChange.getChange();
	
	
	public void getChangeReturned() {
	double nickel = .05;
	double dime = .10;
	double quarter = .25;
	int numNickel;
	int numDime;
	int numQuarter;
	//change += currentChange.getChange();
	if(change == 0) {
		System.out.println("You don't get any change.");
		System.out.println("Transaction Complete!");
		pullFromMain.logAction("GIVE CHANGE", change,pullFromMain.getBalance());
	} else {
	while(change != 0 || change == pullFromMain.getBalance()) {
		 
		if(change >= quarter) {
	         numQuarter = (int)change / (int)quarter;
	         change %= quarter;
	         System.out.println("Change: " + numQuarter + " quarter(s)...");
	      
	     } else if(change >= dime){
	         numDime = (int)change / (int)dime;
	         change %= dime;
	         System.out.println("Change: " + numDime + " dime(s)...");
	      
	     } else if(change >= nickel){
	         numNickel = (int)change / (int)nickel;
	         change %= nickel;
	         System.out.println("Change: " + numNickel + " nickel(s).");
	     }
		
		
		}
		System.out.println("Transaction Complete!");
		pullFromMain.logAction("GIVE CHANGE", change, pullFromMain.getBalance());
	}
	}
	
	
	

} 
