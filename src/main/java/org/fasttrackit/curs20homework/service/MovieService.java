package org.fasttrackit.curs20homework.service;

import org.fasttrackit.curs20homework.model.Movie;
import org.fasttrackit.curs20homework.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository repository;

    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }

    public List<Movie> getAllMovies() {
        return repository.findAll();
    }
}
