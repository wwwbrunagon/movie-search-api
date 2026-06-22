package com.bruna.moviesearch.service;
import org.springframework.stereotype.Service;
import com.bruna.moviesearch.dto.MovieResponse;
import java.util.List;


@Service
public class MovieService {

    public List<MovieResponse> getMovies() {
        return List.of(
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
    }
}