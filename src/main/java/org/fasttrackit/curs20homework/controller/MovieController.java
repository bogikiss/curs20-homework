package org.fasttrackit.curs20homework.controller;

import lombok.RequiredArgsConstructor;
import org.fasttrackit.curs20homework.model.Movie;
import org.fasttrackit.curs20homework.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("movies")
@RequiredArgsConstructor
public class MovieController {
    private final MovieService service;

    @GetMapping
    public List<Movie> getAllMovies() {
        return service.getAllMovies();
    }
}
