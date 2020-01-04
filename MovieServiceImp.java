package com.deloitte.estore.service;

import java.sql.Connection;

import java.util.List;

import com.deloitte.estore.model.Movie;
import com.deloitte.estore.repo.MovieRepo;
import com.deloitte.estore.repo.MovieRepoImp;

public class MovieServiceImp implements MovieService{
	
	MovieRepo repo;
	public MovieServiceImp()
	{
		repo=new MovieRepoImp();
	}
	@Override
	public boolean addMovie(Movie movie) throws Exception {
		// TODO Auto-generated method stub
		return repo.addMovie(movie);
	}

	

	
	@Override
	public Movie getMovieById(int movieId) throws Exception {
		// TODO Auto-generated method stub
		return repo.getMovieById(movieId);
	}

	

}
