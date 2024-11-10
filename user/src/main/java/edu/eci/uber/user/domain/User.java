package edu.eci.uber.user.domain;

import java.util.UUID;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
	
	private UUID id;
	private String name;
	private float[] location = new float[] {0,0};
	
	public User() {}
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float[] getLocation() {
		return location;
	}
	public void setLocation(float[] location) {
		this.location = location;
	}
	
	
}
