package com.nttdata.persistence;

import java.util.List;

import com.nttdata.models.NTTDataEdifice;
import com.nttdata.models.NTTDataFloor;
import com.nttdata.models.NTTDataPerson;

public interface NTTDataEdificeDaoI {
	public void insertFloor(NTTDataFloor floor, NTTDataEdifice edifice);
	public List<NTTDataPerson> getAllPersons(NTTDataEdifice edifice);
	public NTTDataPerson getPerson(String name, String lastName, NTTDataEdifice edifice);
}
