package com.movieRating.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movieRating.model.Rating;

@RestController
@RequestMapping("/movieRating")
public class MovieRatingController {

	@GetMapping("/{movieId}")
	public Rating movieRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, (Math.random() % 10));
	}

}
