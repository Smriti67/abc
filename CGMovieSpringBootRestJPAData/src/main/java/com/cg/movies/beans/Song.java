package com.cg.movies.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Song {
	private String songName;
	@Override
	public String toString() {
		return "Song [songName=" + songName + ", singer=" + singer + "]";
	}
	private String singer;
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public Song(String songName, String singer) {
		super();
		this.songName = songName;
		this.singer = singer;
	}
	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}

}
