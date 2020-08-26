package com.movieCatalogue.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movieCatalogue.model.CatalogueItem;

@RestController
@RequestMapping(value = "/moviecatalogue")
public class MovieCatalogueController {

	@GetMapping(value = "/{userId}")
	public List<CatalogueItem> movieCatalogue(@PathVariable("userId") String userId) {

		return Collections.singletonList(new CatalogueItem("Transformers", "Action", "8"));
	}

}
