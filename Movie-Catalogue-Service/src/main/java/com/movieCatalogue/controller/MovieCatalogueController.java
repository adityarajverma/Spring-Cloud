package com.movieCatalogue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.movieCatalogue.model.CatalogueItem;
import com.movieCatalogue.model.Info;
import com.movieCatalogue.model.Rating;

@RestController
@RequestMapping(value = "/moviecatalogue")
public class MovieCatalogueController {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping(value = "/{movieId}")
	public CatalogueItem movieCatalogue(@PathVariable("movieId") String movieId) {

		Info info = restTemplate.getForObject("http://MOVIE-INFO-SERVICE/movieInfo/" + movieId, Info.class);

		Rating rating = restTemplate.getForObject("http://MOVIE-RATING-SERVICE/movieRating/" + movieId, Rating.class);

		CatalogueItem catalogueItem = new CatalogueItem();
		catalogueItem.setInfo(info);
		catalogueItem.setRating(rating);

		return catalogueItem;
	}

}
