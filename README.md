# movie-search-api

Spring Boot project for a movie search API.

## Overview

This repository currently contains the application bootstrap, test scaffold, and Maven build setup for a Java 21 / Spring Boot service.

## Requirements

- Java 21
- Maven, or the included Maven Wrapper (`./mvnw`)

## Run locally

From the project root:

```bash
./mvnw spring-boot:run
```

The application entry point is:

```text
com.bruna.moviesearch.MovieSearchApiApplication
```

## Test

```bash
./mvnw test
```

## Build

```bash
./mvnw clean package
```

## Project structure

```text
src/main/java/com/bruna/moviesearch/        Application entry point
src/main/resources/                         Application configuration
src/test/java/com/bruna/moviesearch/        Spring Boot test scaffold
```

## Configuration

Application configuration lives in `src/main/resources/application.properties`.

