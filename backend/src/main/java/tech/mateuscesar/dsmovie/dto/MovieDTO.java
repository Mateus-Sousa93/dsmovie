package tech.mateuscesar.dsmovie.dto;

import tech.mateuscesar.dsmovie.entities.Movie;

public class MovieDTO {
	private Long id;
	private String title;
	private Double score;
	private Integer count;
	private String image;

public MovieDTO() {
	}

public MovieDTO(Long id, String title, Double score, Integer count, String image) {
	this.id = id;
	this.title = title;
	this.score = score;
	this.count = count;
	this.image = image;
	}


public MovieDTO(Movie movie) {
	id = movie.getId(); //estava this.movie mas nao tem necessidade no de cima precisa é um do objeto e o outro do argumento
	title = movie.getTitle();
	score = movie.getscore();
	count = movie.getCount();
	image = movie.getImage();
	}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public Double getScore() {
	return score;
}

public void setScore(Double score) {
	this.score = score;
}

public Integer getCount() {
	return count;
}

public void setCount(Integer count) {
	this.count = count;
}

public String getImage() {
	return image;
}

public void setImage(String image) {
	this.image = image;
}


}
