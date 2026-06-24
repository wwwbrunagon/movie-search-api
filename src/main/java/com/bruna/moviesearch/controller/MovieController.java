package com.bruna.moviesearch.controller;

import com.bruna.moviesearch.dto.MovieSearchResponse;
import com.bruna.moviesearch.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies/search")
    public MovieSearchResponse searchMovies(
            @RequestParam String query,
            @RequestParam(defaultValue = "1") Integer page
    ) {
        return movieService.searchMovies(query, page);
    }
}