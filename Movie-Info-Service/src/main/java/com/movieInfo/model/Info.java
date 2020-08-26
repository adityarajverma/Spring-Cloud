package com.movieInfo.model;

public class Info {

	private String id;
	private String Name;

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

	public Info(String id, String name) {
		super();
		this.id = id;
		Name = name;
	}

}
