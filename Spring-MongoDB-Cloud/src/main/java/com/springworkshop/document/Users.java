package com.springworkshop.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")
public class Users {

	@Id
	private String id;
	private String Name;
	private String Place;
	private String State;
	private String Country;

	public Users() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPlace() {
		return Place;
	}

	public void setPlace(String place) {
		Place = place;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", Name=" + Name + ", Place=" + Place + ", State=" + State + ", Country=" + Country
				+ "]";
	}

	public Users(String id, String name, String place, String state, String country) {
		super();
		this.id = id;
		Name = name;
		Place = place;
		State = state;
		Country = country;
	}

}
