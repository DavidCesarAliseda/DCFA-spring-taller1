package com.nttdata.models;

import java.util.ArrayList;

public class NTTDataEdifice {
	private String street;
	private int number;
	private ArrayList<NTTDataFloor> floors;
	
	public NTTDataEdifice() {
		super();
		this.floors = new ArrayList<NTTDataFloor>();
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	public ArrayList<NTTDataFloor> getFloors() {
		return floors;
	}

	public void setFloors(ArrayList<NTTDataFloor> floors) {
		this.floors = floors;
	}

	
	

	
	
	
	
	
}
