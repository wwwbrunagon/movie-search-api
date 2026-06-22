package com.bruna.moviesearch.dto;

public record MovieResponse(
  Long id,
  String title,
  String overview,
  String releaseDate,
  Double voteAverage,
  String posterPath
){}

/*
Records are a modern Java way to create simple data transport objects.
This file contains no business logic.
It exists solely to define the format of the API response.
*/