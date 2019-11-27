package com.grandtours.assets;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

import com.grandtours.assets.interfaces.Maintainable;
import com.grandtours.assets.interfaces.Purchasable;
import com.grandtours.person.Person;

public abstract class Vehicle extends Asset implements Maintainable, Purchasable {

	public Vehicle() {
		super();
	}

	public abstract <E extends Vehicle, K> E setVehicleModel(K vehicleModel);
	
	public abstract <E> E getVehicleModel();
	
	public abstract <E extends Vehicle, K> E setRoute(K route);
	
	public abstract <E> E getRoute();
	
	public abstract <E extends Vehicle, K extends Person> E setDriver(K driver);
	
	public abstract <K> K getDriver();
	
	public abstract <E extends Vehicle, K> E setBranchOrigin(K origin);
	
	public abstract <K> K getBranchOrigin();	

}
