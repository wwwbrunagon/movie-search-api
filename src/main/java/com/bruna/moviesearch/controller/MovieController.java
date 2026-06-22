package com.bruna.moviesearch.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bruna.moviesearch.service.MovieService;
import com.bruna.moviesearch.dto.MovieResponse;

import java.util.List;

@RestController
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public List<MovieResponse> getMovies(){
        return movieService.getMovies();
    }
}
