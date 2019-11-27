package com.grandtours.person;

import java.time.LocalDate;

public abstract class Person {

	private String name;
	private long id;
	private LocalDate birthdate;
	
	public String getName() {
		return name;
	}
	public long getId() {
		return id;
	}
	public LocalDate getBirthdate() {
		return birthdate;
	}
	
	public abstract <E extends Person> E setName(String name);
	
	public abstract <E extends Person> E setId(long id);
	
	public abstract <E extends Person> E setBirthdate(LocalDate birthdate);
}
