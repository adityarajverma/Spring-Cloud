package com.movieInfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.movieInfo.model.Info;

@RestController
@RequestMapping("/movieInfo")
public class MovieInfoController {

	@Autowired
	RestTemplate restTemplate;

	@Value("${apiKey}")
	String apiKey;

	@GetMapping("/{movieId}")
	public Info movieInfo(@PathVariable("movieId") String movieId) {

		Info info = restTemplate.getForObject("https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" + apiKey,
				Info.class);

		return info;

	}

}
