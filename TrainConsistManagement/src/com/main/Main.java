/*
 *   UC17: Sort Bogie Names Using Arrays.sort()
 * 
 * @author : Developer
 * version : 17.0
 * 
 */


package com.main;

import com.controller.*;
import com.trainconsist.*;

public class Main {

	public static void main(String[] args) {

		Train train = new Train(3);
		MainController mainController = new MainController();

		mainController.displayHeader(); //displaying header

		boolean running = true;
		
		while(running) { 
			int choice = mainController.showMenuAndGetChoice(); // menu
			switch(choice) {
			
			case 1:
				mainController.addBogies(train); // adding bogie 
				break;
			
			case 2:
				mainController.displayOriginal(train); // printing bogies
				break;
				
			case 3:
				mainController.sortByType(train); // performing bubble sort
				break;
			
			case 4:
				mainController.sortByCapacity(train);
				break;
				
			case 5:
				running = false;
				mainController.displayOriginal(train);
				break;
				
			default:
				System.out.println("Invalud choice");
			}
		}
	}
}
