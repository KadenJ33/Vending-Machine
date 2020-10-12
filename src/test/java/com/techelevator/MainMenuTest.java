package com.techelevator;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class MainMenuTest {
	MainMenu menu = new MainMenu();
	
	@Test
	public void display_item_options_list() {
		

		String input = "1";
		String preInput = menu.getMainMenuChoice();
		
		String output = MainMenu.displayItems(listToBeDisplayed);
		Assert.assertEquals(;);
		
		
	}

	
	
	

	
	
}
