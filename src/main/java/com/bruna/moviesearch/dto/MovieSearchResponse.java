package com.bruna.moviesearch.dto;
import java.util.List;

public record MovieSearchResponse(
        Integer page,
        Integer totalPages,
        Integer totalResults,
        List<MovieResponse> results
){ }