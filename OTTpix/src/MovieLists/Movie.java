package MovieLists;

public class Movie {
private int id;
private String movie_name;
private int top_5_movies;
public Movie() {
}
public Movie(int top_5_movies) {
	super();
	this.top_5_movies = top_5_movies;
}
public int getTop_5_movies() {
	return top_5_movies;
}
public void setTop_5_movies(int top_5_movies) {
	this.top_5_movies = top_5_movies;
}
public Movie(int id, String movie_name) {
	this.id = id;
	this.movie_name = movie_name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getMovie_name() {
	return movie_name;
}
public void setMovie_name(String movie_name) {
	this.movie_name = movie_name;
}
@Override
public String toString() {
	return String.format("%4d %-40s",id , movie_name);
}

}
