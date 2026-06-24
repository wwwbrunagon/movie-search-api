package com.bruna.moviesearch.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public record TmdbSearchResponse(
        Integer page,

        @JsonProperty("total_pages")
        Integer totalPages,

        @JsonProperty("total_results")
        Integer totalResults,

        List<TmdbMovieResponse> results

){}