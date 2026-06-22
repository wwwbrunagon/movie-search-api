package com.bruna.moviesearch.service;
import com.bruna.moviesearch.dto.MovieSearchResponse;
import org.springframework.stereotype.Service;
import com.bruna.moviesearch.dto.MovieResponse;
import java.util.List;

@Service
public class MovieService {

    public MovieSearchResponse searchMovies() {
        List<MovieResponse> movies = List.of(
                new MovieResponse(
                        1L,
                        "Interstellar",
                        "A movie about space exploration",
                        "2014-11-07",
                        8.4,
                        "/interstellar-poster.jpg"
                ),
                new MovieResponse(
                        2L,
                        "Inception",
                        "A movie about dreams inside dreams",
                        "2010-07-16",
                        8.3,
                        "/inception-poster.jpg"
                )
        );

        return new MovieSearchResponse(
                1,
                1,
                movies.size(),
                movies
        );
    }
}