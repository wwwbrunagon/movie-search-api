package com.bruna.moviesearch.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record TmdbMovieResponse(
        Long id,
        String title,
        String overview,

        @JsonProperty("release_date")
        String releaseDate,

        @JsonProperty("vote_average")
        Double voteAverage,

        @JsonProperty("poster_path")
        String posterPath
){}
