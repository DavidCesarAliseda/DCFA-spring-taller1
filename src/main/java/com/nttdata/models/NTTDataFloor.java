package com.nttdata.models;

import java.util.ArrayList;

public class NTTDataFloor {
	private int numberFloor;
	private ArrayList<NTTDataPerson> persons;
	
	public NTTDataFloor() {
		super();
		this.persons = new ArrayList<NTTDataPerson>();
	}
	
	public int getNumberFloor() {
		return numberFloor;
	}
	public void setNumberFloor(int numberFloor) {
		this.numberFloor = numberFloor;
	}

	public ArrayList<NTTDataPerson> getPersons() {
		return persons;
	}

	public void setPersons(ArrayList<NTTDataPerson> persons) {
		this.persons = persons;
	}
	
	
	
}
