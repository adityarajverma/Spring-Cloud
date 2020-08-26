package com.movieRating.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movieRating.model.Rating;

@RestController
@RequestMapping("/movieRating")
public class MovieRatingController {

	@GetMapping("/{movieId}")
	public List<Rating> movieRating(@PathVariable("movieId") String movieId) {
		return Collections.singletonList(new Rating(movieId, "8"));
	}

}
