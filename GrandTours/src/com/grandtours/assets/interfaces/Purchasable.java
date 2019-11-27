package com.grandtours.assets.interfaces;

import java.time.LocalDateTime;
import java.time.Period;

import com.grandtours.person.Person;

public interface Purchasable {
	
	public <E> E setPurchaseDate(LocalDateTime purchaseDate);
	
	public LocalDateTime getPurchaseDate();
	
	public <E> E setSupplier(String supplierName);
	
	public <E,K extends Person> E setPurchaser(K purchaser);
	
	public <E extends Person> E getPurchaser();
	
	public <E> E setLifeEndDate(Period period);
	
	public Period getLifeEndDate();
	
	public <E> E setIsActive(boolean isActive);
	
	public boolean isActive();
	
	public <E> E setPurchasePrice(Double price);
	
	public Double getPurchasePrice();

}
