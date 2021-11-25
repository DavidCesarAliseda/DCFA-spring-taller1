package com.nttdata.persistence;

import com.nttdata.models.NTTDataFloor;
import com.nttdata.models.NTTDataPerson;

public interface NTTDataFloorDaoI {
	
	public void insertPerson(NTTDataPerson person, NTTDataFloor floor);
	
}
