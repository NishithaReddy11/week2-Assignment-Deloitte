package com.deloitte.estore.repo;
import java.util.*;

import java.sql.*;
import com.deloitte.estore.model.Movie;
public interface MovieRepo {
	
	boolean addMovie(Movie movie) throws Exception;
	
	Movie getMovieById(int movieId) throws Exception;
	
	
}
