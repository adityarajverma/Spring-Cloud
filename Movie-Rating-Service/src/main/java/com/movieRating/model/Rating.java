package com.movieRating.model;

public class Rating {

	private String id;
	private String rating;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public Rating(String id, String rating) {
		super();
		this.id = id;
		this.rating = rating;
	}

}
