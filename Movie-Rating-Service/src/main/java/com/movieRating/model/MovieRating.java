package com.movieRating.model;

public class MovieRating {

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

	public MovieRating(String id, String rating) {
		super();
		this.id = id;
		this.rating = rating;
	}

}
