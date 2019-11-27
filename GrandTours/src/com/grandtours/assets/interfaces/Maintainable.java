package com.grandtours.assets.interfaces;

import java.time.LocalDate;
import java.time.Period;

import com.grandtours.person.Person;

public interface Maintainable {

	public <E> E setLastMaintenanceDate(LocalDate maintenanceDate);
	public <E> E setNextMaintenanceDate(LocalDate maintenanceDate);
	public <E> E setMaintenancePeriodCycle(Period maintenancePeriod);
	public <E,K> E setMaintenanceProvider(K maintenanceProvider);
	public <E,K extends Person> E setMechanic(K mechanic);
	
	
	public LocalDate getLastMaintenanceDate();
	public LocalDate getNextMaintenanceDate();
	public Period getMaintenancePeriodCycle();
	public Person getMechanic();	
}
