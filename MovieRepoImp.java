package com.deloitte.estore.repo;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

import com.deloitte.estore.model.Movie;



public class MovieRepoImp implements MovieRepo{
//private static final boolean Movie = false;
//Movie movie=new Movie();
List<Movie> m=new ArrayList<>();
	@Override
	public boolean addMovie(Movie movie) throws Exception{
		
		
		m.add(movie);
		if(m.size()!=0)
		{
			return true;
		}
	
		
		return false;
		
	
	}

	
	@Override
	public Movie getMovieById(int movieId) throws Exception{
		//List<Movie> m=new ArrayList<>();
		
		for(Movie movie:m)
		{
		if(movieId==movie.getMovieId())
		{
			return  movie;
		}
		}
		return null;
	}

	
	
	
}
