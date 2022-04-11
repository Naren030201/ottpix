package AdminMovieUnavaliable;

import java.util.List;
import java.util.Scanner;

import AdminLogin.AdminMenu;
import Movie.jdbc.MovieListModify;
import MovieLists.Movie;
import adminSearchMovie.AdminSearchMovie;

public class AdminMovieUnavaliable {
	public static void display() {
	AdminSearchMovie.display();
	System.out.println("Select movie to mark as unavailable (Enter Id):");
	Scanner sc= new Scanner(System.in);
	int id= sc.nextInt();
	MovieListModify modify= new MovieListModify();
	List<Movie> movie= modify.delete(id);
	//movie should be deleted from the movie list
	System.out.printf("Movie with id "+"%d"+" is now unavailable.",id);
	AdminMenu.display();
	} 
}
