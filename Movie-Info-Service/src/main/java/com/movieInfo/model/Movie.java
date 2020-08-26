package com.movieInfo.model;

public class Movie {

	public String id;
	public String Name;

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

	public Movie(String id, String name) {
		super();
		this.id = id;
		Name = name;
	}

}
