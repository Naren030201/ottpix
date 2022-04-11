package ViewTopMovies;
import java.util.*;
import SelectMovieOption.*;
import InternalOptions.*;
import Movie.jdbc.MovieDao;
import MovieLists.Movie;
public class ViewTopMovies {
public static void display() {
	Scanner sc= new Scanner (System.in);
	MovieDao dao = new MovieDao();
	List<Movie> movie=dao.findAll();
	System.out.println("Top 5 Trending Movies");
	System.out.println("=====================");
	System.out.println("Select a movie (Enter Id):");
	int id= sc.nextInt();
	InternalOptions.options();
}
}
