package com.deloitte.estore.application;

import com.deloitte.estore.model.Movie;

import com.deloitte.estore.service.MovieService;
import com.deloitte.estore.service.MovieServiceImp;
import java.util.*;
public class DeloitteEStoreApp {

	public static void main(String[] args) {
	
		MovieService service=new MovieServiceImp();
		Movie p=new Movie();
		System.out.println("Enter movie details:");
		Scanner sc=new Scanner(System.in);
		
		try
		{	
			while(true)
			{
			System.out.println("Enter 1 for adding and 2 for checking details:");
			int ch=sc.nextInt();
			if(ch==1)
			{
			System.out.println("Enter movie id");
			int id=sc.nextInt();
			System.out.println("Enter movie name");
			String name=sc.next();
			System.out.println("Enter date");
			String date=sc.next();
			System.out.println("Enter time");
			String time=sc.next();
			System.out.println("Enter status");
			String status=sc.next();
			Movie movie=new Movie(id,name,date,time,status);
			
			if(service.addMovie(movie))
				{
					System.out.println("movie added");
				}
				else
				{
					System.out.println("not added");
				}
			}
			if(ch==2)
			{
			System.out.println("Enter the movie id");
			int s=sc.nextInt();
			Movie m=new Movie();
			m=service.getMovieById(s);
			
			if(m!=null)
			{
			System.out.println("Movie id:"+m.getMovieId()+"\nMovie Name:"+m.getMovieName()+"\nDate:"+m.getDate()+"\nTime:"+m.getTime()+"\nStatus:"+m.getStatus());
			}
		else
			{
			System.out.println("Not id present");
			}
			}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
