package com.nttdata.persistence;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nttdata.models.NTTDataEdifice;
import com.nttdata.models.NTTDataFloor;
import com.nttdata.models.NTTDataPerson;


@Repository
public class NTTDataEdificeDaoImpl implements NTTDataEdificeDaoI {

	@Override
	public void insertFloor(NTTDataFloor floor, NTTDataEdifice edifice) {

		edifice.getFloors().add(floor);

	}

	@SuppressWarnings("null")
	@Override
	public List<NTTDataPerson> getAllPersons(NTTDataEdifice edifice) {
		List<NTTDataPerson> persons= new ArrayList<NTTDataPerson>() ;
		for(int i =0; i<edifice.getFloors().size(); i++) {
			NTTDataFloor floor = edifice.getFloors().get(i);
			for(int j = 0; j<floor.getPersons().size(); j++) {
				persons.add(floor.getPersons().get(j));
			}
		}
		return persons;
	}

	@Override
	public NTTDataPerson getPerson(String nombre, String apellidos, NTTDataEdifice edifice) {
		NTTDataPerson person = new NTTDataPerson();
		for(int i =0; i<edifice.getFloors().size(); i++) {
			NTTDataFloor floor = edifice.getFloors().get(i);
			for(int j = 0; j<floor.getPersons().size(); j++) {
				NTTDataPerson p = floor.getPersons().get(j);
				if(p.getName().equalsIgnoreCase(nombre) && p.getLastName().equalsIgnoreCase(apellidos)) {
					person=p;
				}
				
			}
		}
		return person;
	}

}
