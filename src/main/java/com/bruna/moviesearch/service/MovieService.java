package com.bruna.moviesearch.service;

import com.bruna.moviesearch.client.TmdbClient;
import com.bruna.moviesearch.dto.MovieResponse;
import com.bruna.moviesearch.dto.MovieSearchResponse;
import com.bruna.moviesearch.dto.TmdbMovieResponse;
import com.bruna.moviesearch.dto.TmdbSearchResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final TmdbClient tmdbClient;

    public MovieService(TmdbClient tmdbClient) {
        this.tmdbClient = tmdbClient;
    }

    public MovieSearchResponse searchMovies(String query, Integer page) {
        TmdbSearchResponse tmdbResponse = tmdbClient.searchMovies(query, page);

        List<MovieResponse> movies = tmdbResponse.results()
                .stream()
                .map(this::mapToMovieResponse)
                .toList();

        return new MovieSearchResponse(
                tmdbResponse.page(),
                tmdbResponse.totalPages(),
                tmdbResponse.totalResults(),
                movies
        );
    }

    private MovieResponse mapToMovieResponse(TmdbMovieResponse tmdbMovie) {
        return new MovieResponse(
                tmdbMovie.id(),
                tmdbMovie.title(),
                tmdbMovie.overview(),
                tmdbMovie.releaseDate(),
                tmdbMovie.voteAverage(),
                tmdbMovie.posterPath()
        );
    }
}