package com.deloitte.estore.model;

public class Movie {

		private int movieid;
		private String moviename;
		private String date;
		private String time;
		private String status;
		public Movie()
		{
			
		}
		public Movie(int movieid, String moviename, String date, String time, String status) {
			super();
			this.movieid = movieid;
			this.moviename = moviename;
			this.date = date;
			this.time = time;
			this.status = status;
		}
		public int getMovieId() {
			return movieid;
		}
		public void setMovieId(int movieId) {
			this.movieid = movieId;
		}
		public String getMovieName() {
			return moviename;
		}
		public void setMovieName(String movieName) {
			this.moviename = movieName;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getTime() {
			return time;
		}
		public void setTime(String time) {
			this.time = time;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		@Override
		public String toString() {
			return "Movie [movieId=" + movieid + ", movieName=" + moviename + ", date=" + date + ", time=" + time
					+ ", status=" + status + "]";
		}
		
		
}
