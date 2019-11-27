package com.grandtours.assets;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

import com.grandtours.person.Person;

public class Van extends Vehicle {

	public Van() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public <E> E setLastMaintenanceDate(LocalDate maintenanceDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <E> E setNextMaintenanceDate(LocalDate maintenanceDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <E> E setMaintenancePeriodCycle(Period maintenancePeriod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <E, K> E setMaintenanceProvider(K maintenanceProvider) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <E, K extends Person> E setMechanic(K mechanic) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocalDate getLastMaintenanceDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocalDate getNextMaintenanceDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Period getMaintenancePeriodCycle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person getMechanic() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <E> E setPurchaseDate(LocalDateTime purchaseDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocalDateTime getPurchaseDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <E> E setSupplier(String supplierName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <E, K extends Person> E setPurchaser(K purchaser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <E extends Person> E getPurchaser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <E> E setLifeEndDate(Period period) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Period getLifeEndDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <E> E setIsActive(boolean isActive) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isActive() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <E> E setPurchasePrice(Double price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getPurchasePrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <E extends Vehicle, K> E setVehicleModel(K vehicleModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <E> E getVehicleModel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <E extends Vehicle, K> E setRoute(K route) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <E> E getRoute() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <E extends Vehicle, K extends Person> E setDriver(K driver) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <K> K getDriver() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <E extends Vehicle, K> E setBranchOrigin(K origin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <K> K getBranchOrigin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean build() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <E extends Asset> E setId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <E extends Asset> E setName(long name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <E extends Asset> E setAcquireDate(LocalDateTime acquireDate) {
		// TODO Auto-generated method stub
		return null;
	}

}
