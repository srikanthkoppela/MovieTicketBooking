package com.movietickets.booking.controllers;

import com.movietickets.booking.models.Movie;
import com.movietickets.booking.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    MovieService movieService;

    @RequestMapping(value = "/movies", method = RequestMethod.GET)
    public List<Movie> getAllMovies() {

        List<Movie> movies =   movieService.getAllMovies();
        return movies;

    }

    @RequestMapping(value = "/movies", method = RequestMethod.POST)
    public Movie getMovie(@RequestBody Movie movie) {
        return movieService.getMovie(movie);

    }
}
