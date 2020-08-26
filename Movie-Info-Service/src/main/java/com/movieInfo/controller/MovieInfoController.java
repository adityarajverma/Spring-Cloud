package com.movieInfo.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movieInfo.model.Movie;

@RestController
@RequestMapping("/movieInfo")
public class MovieInfoController {

	@GetMapping("/{movieId}")
	public List<Movie> movieInfo(@PathVariable("movieId") String movieID) {

		return Collections.singletonList(new Movie(movieID, "Transformer"));

	}

}
