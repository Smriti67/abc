package com.cg.movies.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.movies.beans.Movie;
import com.cg.movies.exceptions.MovieDetailsNotFoundException;
import com.cg.movies.services.MovieServices;

@Controller
public class MovieServicesController {
	@Autowired
	MovieServices movieServices;

	@RequestMapping(value= {"/sayHello"},method=RequestMethod.GET)
	public ResponseEntity<String> sayHello(){
		return new ResponseEntity<String>("Hello Hello",HttpStatus.OK);
		
	}


	@RequestMapping(value= {"/getMovieDetails"},method=RequestMethod.GET,produces= MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json")
	public ResponseEntity<Movie> getMovieDetailsRequestParam(@RequestParam int movieId)throws MovieDetailsNotFoundException{
		Movie movie=movieServices.getMovieDetails(movieId);
		return new ResponseEntity<Movie>(movie,HttpStatus.OK);
	}


	@RequestMapping(value= {"/getMovieDetails/{movieId}"},method=RequestMethod.GET,produces= MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json")
	public ResponseEntity<Movie> getMovieDetailsPathParam(@PathVariable(value="movieId") int movieId)throws MovieDetailsNotFoundException{
		Movie movie=movieServices.getMovieDetails(movieId);
		return new ResponseEntity<Movie>(movie,HttpStatus.OK);
	}
	@RequestMapping(value= {"/getAllMovieDetails"},method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json")
	public ResponseEntity<List<Movie>> getMovieDetailsPathParam(){
		return new ResponseEntity<List<Movie>>(movieServices.getAllMoviesDetails(),HttpStatus.OK);
	}
	@RequestMapping(value= {"/acceptMovieDetails"},method=RequestMethod.POST,consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ResponseEntity<String>acceptMovieDetails(@ModelAttribute Movie movie){
		movie=movieServices.acceptMovieDetails(movie);
		return new ResponseEntity<>("Movie details successfully added movie Id:-"+movie.getMovieId(),HttpStatus.OK);
	}
	@RequestMapping(value="/removeMovieDetails",method=RequestMethod.DELETE,consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ResponseEntity<String> removeAssociateDetails(@RequestParam int movieId) throws MovieDetailsNotFoundException{
		movieServices.removeMovieDetails(movieId);
		return new ResponseEntity<>("Movie details successfully Removed",HttpStatus.OK);
	}
}

