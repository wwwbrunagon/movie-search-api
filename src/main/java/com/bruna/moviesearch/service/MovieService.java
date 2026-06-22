package com.bruna.moviesearch.service;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    public String getMovies(){
        return "Movie list from service";
    }
}