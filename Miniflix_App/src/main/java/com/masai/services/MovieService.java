package com.masai.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Movie;
import com.masai.repository.MovieDAO;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieDAO movieDAO;

    public List<Movie> getAllMovies() {
        return movieDAO.getAllMovies();
    }

    public Movie getMovieById(Long id) {
        return movieDAO.getMovieById(id);
    }

    public void addMovie(Movie movie) {
        movieDAO.addMovie(movie);
    }

    public void updateMovie(Movie updatedMovie) {
        movieDAO.updateMovie(updatedMovie);
    }

    public void deleteMovie(Long id) {
        movieDAO.deleteMovie(id);
    }
}

