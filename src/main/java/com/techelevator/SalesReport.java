package com.techelevator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SalesReport {
	
	//takes the output of the 
	public void writeReport() {
		String newPath = System.getProperty("user.dir");
		String fileName = "SalesReport.txt";
		File report = new File(newPath, fileName);
		
		try {
			report.createNewFile();
		} catch (IOException e) {
			System.out.println("Error!");
		}
		
		try (PrintWriter pw = new PrintWriter(new FileWriter(report, true))) {
			
		}catch(IOException e){	
			System.out.println("Error!");
		}
		}
}
