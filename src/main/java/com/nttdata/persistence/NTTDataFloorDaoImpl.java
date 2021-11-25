package com.nttdata.persistence;

import org.springframework.stereotype.Repository;

import com.nttdata.models.NTTDataFloor;
import com.nttdata.models.NTTDataPerson;


@Repository
public class NTTDataFloorDaoImpl implements NTTDataFloorDaoI{

	@Override
	public void insertPerson(NTTDataPerson person, NTTDataFloor floor) {

			floor.getPersons().add(person);
			
	}
}
