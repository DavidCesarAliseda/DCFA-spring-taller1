package com.nttdata.models;

/**
 * Spring - Taller 1
 * 
 * Entidad de tabla NTTDataPerson
 * 
 * @author David Cesar Fernandez Aliseda
 *
 */

public class NTTDataPerson {
	private String name;
	private String lastName;
	private int age;
	
	public NTTDataPerson() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "NTTDataPerson [name=" + name + ", lastName=" + lastName + "]";
	}
	
	
}
