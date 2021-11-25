package com.nttdata.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.models.NTTDataEdifice;
import com.nttdata.models.NTTDataFloor;
import com.nttdata.models.NTTDataPerson;
import com.nttdata.persistence.NTTDataEdificeDaoI;
import com.nttdata.persistence.NTTDataFloorDaoI;
@Service
public class NTTDataEdificeManagementServiceImpl implements NTTDataEdificeManagementServiceI {

	@Autowired
	private NTTDataEdificeDaoI edificeDao;
	
	@Autowired
	private NTTDataFloorDaoI floorDao;
	
	@Override
	public void insertFloor(NTTDataFloor floor, NTTDataEdifice edifice) {
		if(floor != null && edifice != null) {
			edificeDao.insertFloor(floor, edifice);
		}
	}

	@Override
	public List<NTTDataPerson> getAllPersons(NTTDataEdifice edifice) {
		List<NTTDataPerson> persons = null;
		if(edifice != null) {
			persons = edificeDao.getAllPersons(edifice);
		}
		return persons;
	}

	@Override
	public void insertPerson(NTTDataPerson person, NTTDataFloor floor) {
		if(floor != null && person != null) {
			floorDao.insertPerson(person, floor);
		}
	}

	@Override
	public NTTDataPerson getPerson(String nombre, String apellidos, NTTDataEdifice edifice) {
		NTTDataPerson person = new NTTDataPerson();
		if(nombre!=null && apellidos !=null && edifice != null) {
			person=edificeDao.getPerson(nombre, apellidos, edifice);
		}
		return person;
	}

}
