package com.masai.repository;

import org.springframework.stereotype.Repository;
import com.masai.model.Movie;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieDAO {

    private List<Movie> movies = new ArrayList<>();

    public void init() {
        movies.add(new Movie(1L, "Inception", "Sci-Fi", 2010));
        movies.add(new Movie(2L, "The Dark Knight", "Action", 2008));
        movies.add(new Movie(3L, "Interstellar", "Sci-Fi", 2014));
    }

    public List<Movie> getAllMovies() {
        return movies;
    }

    public Movie getMovieById(Long id) {
        return movies.stream()
                .filter(movie -> movie.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void updateMovie(Movie updatedMovie) {
        movies.removeIf(movie -> movie.getId().equals(updatedMovie.getId()));
        movies.add(updatedMovie);
    }

    public void deleteMovie(Long id) {
        movies.removeIf(movie -> movie.getId().equals(id));
    }
}
