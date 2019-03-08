package com.cg.movies.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.movies.beans.Movie;

public interface MovieDAO extends JpaRepository<Movie,Integer>{
	
}
