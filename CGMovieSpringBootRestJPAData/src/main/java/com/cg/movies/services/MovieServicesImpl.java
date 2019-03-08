package com.cg.movies.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.movies.beans.Movie;
import com.cg.movies.daoservices.MovieDAO;
import com.cg.movies.exceptions.MovieDetailsNotFoundException;



@Component("movieServices")
public class MovieServicesImpl implements MovieServices{
	@Autowired
	private MovieDAO movieDao;

	@Override
	public Movie acceptMovieDetails(Movie movie) {
		movie=movieDao.save(movie);
			return movie;
	}

	@Override
	public Movie getMovieDetails(int movieId) throws MovieDetailsNotFoundException {
		Movie movie = movieDao.findById(movieId).orElseThrow
				(()->new MovieDetailsNotFoundException("Movie details not found movie Id"+movieId));
		if(movie == null)
			throw new MovieDetailsNotFoundException("Movie details not found for Id:" + movieId);
		return movie;
	}

	@Override
	public List<Movie> getAllMoviesDetails() {
		return movieDao.findAll();
	}

	@Override
	public boolean removeMovieDetails(int movieId) throws MovieDetailsNotFoundException {
		movieDao.delete(getMovieDetails(movieId));
		return true;
	}

}
