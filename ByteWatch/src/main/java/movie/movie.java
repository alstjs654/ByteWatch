package movie;

import java.util.ArrayList;

public class movie {

	private int movie_num;
	private String movie_name;
	private String actor;
	private String director;
	private String genre;
	private String country;
	private int userRating;
	private String image;
	private String detail;
	private String series;
	private String preview;
	private String making_film;
	private String platform;
	
	public movie() {}
	
	public movie(int movie_num,String genre,String image) {
		this.movie_num=movie_num;
		this.genre=genre;
		this.image=image;
	}
	public movie(int movie_num,String movie_name,String actor, String director,String genre,
			String country,int userRating,String image,String detail,String series,String preview,String making_film,String platform) {
		this.movie_num=movie_num;
		this.movie_name=movie_name;
		this.actor=actor;
		this.director=director;
		this.genre=genre;
		this.country=country;
		this.userRating=userRating;
		this.image=image;
		this.detail=detail;
		this.series=series;
		this.preview=preview;
		this.making_film=making_film;
		this.platform=platform;
		
		
		
	}
	public void setMovie_num(int movie_num) {
		this.movie_num = movie_num;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getUserRating() {
		return userRating;
	}
	public void setUserRating(int userRating) {
		this.userRating = userRating;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		series = series;
	}
	public String getPreview() {
		return preview;
	}
	public void setPreview(String preview) {
		preview = preview;
	}
	public String getMaking_Film() {
		return making_film;
	}
	public void setMaking_Film(String making_film) {
		making_film = making_film;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getMaking_film() {
		return making_film;
	}

	public void setMaking_film(String making_film) {
		this.making_film = making_film;
	}

	public int getMovie_num() {
		return movie_num;
	}
	
}
