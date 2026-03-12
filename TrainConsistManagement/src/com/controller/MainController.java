package com.controller;
import java.util.*;

import com.trainconsist.*;


public class MainController {
	
    Scanner sc = new Scanner(System.in);
    
    public void displayHeader() {
        System.out.println("====================================================");
        System.out.println("        ===Train Consist Management App==           ");
        System.out.println("==================================================\n");
    }
    
    // taking user input 
    public int showMenuAndGetChoice() { 
        System.out.println("\n1. Add bogies");
        System.out.println("2. View Bogies");
        System.out.println("3. Sort bogies by Bogie Type");
        System.out.println("4. Sort bogies by bogie capacity");
        System.out.println("5. Logout");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }
    
    //adding bogies
    public void addBogies(Train train) {
    	for(int i=0;i<train.getType().length;i++) {
    		System.out.print("Enter bogie type (Sleeper, AC, General) : ");
    		String type = sc.nextLine();
    		System.out.print("Enter bogie capacity : ");
    		int capacity = sc.nextInt();
    		sc.nextLine();
    		train.addBogie(type, capacity);
    	}
    	
    	System.out.println("All bogies added");
    	
    }
    
    // sortig bogies on the basis of their types
    public void sortByType(Train train) {
    	train.sortBogieTypes();
    	System.out.println("Sorted by type : ");
    	for(int i=0;i<train.getCount();i++) {
        	System.out.print(train.getType()[i] + (i<train.getCount()-1 ? ", ":""));
        }
    }
    
 // sortig bogies on the basis of their capacities
    public void sortByCapacity(Train train) {
    	train.sortBogieCapacity();
    	System.out.println("Sorted by capapcity : ");
    	for(int i=0;i<train.getCount();i++) {
        	System.out.print(train.getCapacity()[i] + (i<train.getCount()-1 ? ", ":""));
        }
    }

    // displaying all bogies
    public void displayOriginal(Train train) {
        System.out.println("\nOriginal Order :"); 
        System.out.print("Types : ");
        for(int i=0;i<train.getCount();i++) {
        	System.out.print(train.getType()[i] + (i<train.getCount()-1 ? ", ":""));
        }
        
        System.out.print("\nCapacities : ");
        for(int i=0;i<train.getCount();i++) {
        	System.out.print(train.getCapacity()[i] + (i<train.getCount()-1 ? ", ":""));
        }
        System.out.println();
        
    }

}