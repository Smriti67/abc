package com.cg.movies.services;

import java.util.List;

import com.cg.movies.beans.Movie;
import com.cg.movies.exceptions.MovieDetailsNotFoundException;



public interface MovieServices {
	Movie acceptMovieDetails (Movie movie);
	Movie getMovieDetails(int movieId) throws MovieDetailsNotFoundException;
	List<Movie> getAllMoviesDetails();
    boolean removeMovieDetails(int associateId) throws MovieDetailsNotFoundException;
}
