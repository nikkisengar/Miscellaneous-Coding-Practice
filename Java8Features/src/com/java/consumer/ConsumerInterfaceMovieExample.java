package com.java.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

class Movie{
	String movieName;
	String movieActor;
	String movieActress;
	
	//Constructor with fields
	public Movie(String movieName, String movieActor, String movieActress) {
		super();
		this.movieName = movieName;
		this.movieActor = movieActor;
		this.movieActress = movieActress;
	}
}

public class ConsumerInterfaceMovieExample {

	public static void main(String[] args) {
		
		ArrayList<Movie> list=new ArrayList<Movie>();
		populate(list);
		
		Consumer<Movie> c=movie->{
			
			System.out.println("Movie Name: "+movie.movieName);
			System.out.println("Movie Actor: "+movie.movieActor);
			System.out.println("Movie Actress: "+movie.movieActress);
			System.out.println();
		};
		
		for(Movie movie: list) {
			c.accept(movie);
		}

	}
	
	public static void populate(ArrayList<Movie> list) {
		list.add(new Movie("Dangal", "Aamir Khan", "Sakshi Tanwar"));
		list.add(new Movie("Koi Mil Gaya", "Hrithik Roshan", "Preity Zinta"));
		list.add(new Movie("Swades", "Shah Rukh Khan", "Gayatri Joshi"));
		list.add(new Movie("Gangs of Wasseypur", "Manoj Bajpayee", "Richa Chadha"));
		list.add(new Movie("Anand", "Rajesh Khanna", "Sumita Sanyal"));
		list.add(new Movie("Munna Bhai M.B.B.S.", "Sanjay Dutt", "Gracy Singh"));
		list.add(new Movie("Barfi!", "Ranbir Kapoor", "Priyanka Chopra"));
	}
}
