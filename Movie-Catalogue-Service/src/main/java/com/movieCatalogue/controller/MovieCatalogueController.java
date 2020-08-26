package com.movieCatalogue.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.movieCatalogue.model.CatalogueItem;
import com.movieCatalogue.model.Info;

@RestController
@RequestMapping(value = "/moviecatalogue")
public class MovieCatalogueController {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping(value = "/{movieId}")
	public List<CatalogueItem> movieCatalogue(@PathVariable("movieId") String movieId) {

		Info info = restTemplate.getForObject("http://MOVIE-INFO-SERVICE/" + movieId, Info.class);

		return Collections.singletonList(new CatalogueItem("Transformers", "Action", "8"));
	}

}
