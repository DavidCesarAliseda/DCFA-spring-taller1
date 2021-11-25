package com.nttdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.models.NTTDataEdifice;
import com.nttdata.models.NTTDataFloor;
import com.nttdata.models.NTTDataPerson;
import com.nttdata.services.NTTDataEdificeManagementServiceI;
import com.nttdata.services.NTTDataEdificeManagementServiceImpl;

@SpringBootApplication
public class DcfaSpringTaller1Application implements CommandLineRunner{
	
	@Autowired
	private NTTDataEdificeManagementServiceI edificeService;
	
	public static void main(String[] args) {
		SpringApplication.run(DcfaSpringTaller1Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		/*Crear personas*/
		NTTDataPerson person1 = new NTTDataPerson();
		person1.setName("David");
		person1.setLastName("Aliseda");
		person1.setAge(25);
		
		NTTDataPerson person2 = new NTTDataPerson();
		person2.setName("Pepito");
		person2.setLastName("Perez");
		person2.setAge(32);
		
		NTTDataPerson person3 = new NTTDataPerson();
		person3.setName("Juan");
		person3.setLastName("GGonzalez");
		person3.setAge(19);
		
		NTTDataPerson person4 = new NTTDataPerson();
		person4.setName("Sara");
		person4.setLastName("Gomez");
		person4.setAge(28);
		
		/*Crear edificio*/
		NTTDataEdifice e1 = new NTTDataEdifice();
		
		/*Crear plantas*/
		NTTDataFloor f1 = new NTTDataFloor();
		f1.setNumberFloor(0);
		edificeService.insertFloor(f1, e1);
		
		NTTDataFloor f2 = new NTTDataFloor();
		f2.setNumberFloor(1);
		edificeService.insertFloor(f2, e1);
		
		/*Insertar personas en las plantas*/
		edificeService.insertPerson(person1, f1);
		edificeService.insertPerson(person2, f1);
		edificeService.insertPerson(person3, f1);
		edificeService.insertPerson(person4, f2);
		
		/*Metodos para obtener personas*/
		System.out.println(edificeService.getAllPersons(e1));
		System.out.println(edificeService.getPerson("David", "Aliseda", e1));
	}
}
