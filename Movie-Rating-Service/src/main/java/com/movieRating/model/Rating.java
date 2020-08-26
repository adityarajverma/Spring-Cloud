package com.movieRating.model;

public class Rating {

	private String id;
	private Double rating;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Rating(String id, Double rating) {
		super();
		this.id = id;
		this.rating = rating;
	}

}
