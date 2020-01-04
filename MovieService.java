package com.deloitte.estore.service;



import java.util.List;

import com.deloitte.estore.model.Movie;


public interface MovieService {

	
	boolean addMovie(Movie movie) throws Exception;
//	boolean deleteProduct(Product product) throws Exception;
//	boolean updateProduct(Product product) throws Exception;
	Movie getMovieById(int movieId) throws Exception;
//	List<> getAllProducts() throws Exception;
//	Connection getDbConnection() throws Exception;
}
