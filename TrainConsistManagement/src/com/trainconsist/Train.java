package com.trainconsist;

import java.util.*;

//Train class for storing list of bogies attached to the train

public class Train {

	private String[] bogieTypes;
	private int[] bogieCapacities;
	private int count;

	public Train(int size){
		bogieTypes = new String[size];
		bogieCapacities = new int[size];
		count = 0;
	}

	public void addBogie(String type, int capacity){ // add objects to the list
		if(count<bogieTypes.length) {
			bogieTypes[count] = type;
			bogieCapacities[count] = capacity;
			count++;
			
		} 
	}
	public String[] getType() {
		return bogieTypes;
	} 

	public int[] getCapacity() {
		return bogieCapacities; 
	}

	public int getCount() {
		return count;
	}


	public void sortBogieTypes() {
		Arrays.sort(bogieTypes);
	}
	
	public void sortBogieCapacity() {
		Arrays.sort(bogieCapacities);
	}
}


