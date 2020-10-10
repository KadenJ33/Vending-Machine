package com.techelevator;

public class FinishTransaction extends SelectProduct{
	
	SelectProduct currentChange = new SelectProduct();
	MainMenu pullFromMain = new MainMenu();
	
	double change = MainMenu.getBalance();
	double newBalance = MainMenu.getBalance();
	
	public void getChangeReturned() {
	double nickel = .05;
	double dime = .10;
	double quarter = .25;
	double numNickel;
	double numDime;
	double numQuarter;
	//change += currentChange.getChange();
	
	
	pullFromMain.logAction("GIVE CHANGE", change, newBalance);
	if(change == 0) {
		System.out.println("You don't get any change.");
		System.out.println("Transaction Complete!");
		//pullFromMain.logAction("GIVE CHANGE", change,pullFromMain.getBalance());
	} else {
	while(change != 0 || change == newBalance) {
		 
		if(change >= quarter) {
	         numQuarter = change / quarter;
	         change %= quarter;
	         change = (int)change; 
	         System.out.println("Change: " + numQuarter + " quarter(s)...");
	         
	         change = (double)change;
	      
	     } if(change >= dime){
	         numDime = change / dime;
	         change %= dime;
	         change = (int)change;
	         System.out.println("Change: " + numDime + " dime(s)...");
	         
	         change = (double)change;
	         
	     } if(change >= nickel){
	         numNickel = change / nickel;
	         change %= nickel; 
	         change = (int)change;
	         System.out.println("Change: " + numNickel + " nickel(s).");
	        
	         change = (double)change;
	     }
		
		
		}
		System.out.println("Transaction Complete!");
		
	}
	}
	
	
	

} 
