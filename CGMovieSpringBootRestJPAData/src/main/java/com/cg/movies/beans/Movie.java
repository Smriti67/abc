package com.cg.movies.beans;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int movieId;
	private String movieName;
	private String actor;
	private String actress;
    @Embedded
	Song song;
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getActress() {
		return actress;
	}
	public void setActress(String actress) {
		this.actress = actress;
	}
	public Song getSong() {
		return song;
	}
	public void setSong(Song song) {
		this.song = song;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", actor=" + actor + ", actress=" + actress
				+ ", song=" + song + "]";
	}
	public Movie(int movieId, String movieName, String actor, String actress, Song song) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.actor = actor;
		this.actress = actress;
		this.song = song;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

}
