package com.java.consumer;

import java.util.function.Consumer;

class MovieInfo{
	String movieName;
	String movieReview;
	
	//Constructor using fields
	public MovieInfo(String movieName, String movieReview) {
		super();
		this.movieName = movieName;
		this.movieReview = movieReview;
	}
}

public class ConsumerChaningTest {

	public static void main(String[] args) {
		
		MovieInfo movieInfo=new MovieInfo("Shubh Mangal Zyada Saavdhan", "Super Hit");
		
		Consumer<MovieInfo> c1=movie-> System.out.println("Movie "+movie.movieName+" is going to be released.");
		Consumer<MovieInfo> c2=movie-> System.out.println("Movie "+movie.movieName+" Review will be: "+movie.movieReview);
		Consumer<MovieInfo> c3=movie-> System.out.println("Movie "+movie.movieName+" name is stored in database.");
		
		Consumer<MovieInfo> chainingConsumer=c1.andThen(c2).andThen(c3);
		chainingConsumer.accept(movieInfo);
	}
}
