package com.grandtours.assets;

import java.time.LocalDateTime;

public abstract class Asset {
	private long id;
	private String name;
	private LocalDateTime acquireDate;

	private Asset(long id, String name, LocalDateTime acquireDate) {
		this.id = id;
		this.name = name;
		this.acquireDate = acquireDate;
	};

	public Asset() {		
	}
	
	public abstract boolean build();

	public abstract <E extends Asset> E setId(long id);

	public abstract <E extends Asset> E setName(long name);

	public abstract <E extends Asset> E setAcquireDate(LocalDateTime acquireDate);

	public long getId() {
		return id;
	}

	public String name() {
		return name;
	}

	public LocalDateTime getAcquireDate() {
		return acquireDate;
	}
}
