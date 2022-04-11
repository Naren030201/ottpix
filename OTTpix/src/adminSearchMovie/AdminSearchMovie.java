package adminSearchMovie;
import java.util.*;

import AdminLogin.AdminMenu;
import Movie.jdbc.MovieSearch;
import MovieLists.Movie;
public class AdminSearchMovie {
	public static void display() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Search movie with keyword:");
	String Keyword= sc.nextLine();
	MovieSearch search = new MovieSearch();
	List<Movie> movie=search.findAll(Keyword);
		System.out.printf("Search result for "+"%s\n" , Keyword);
		movie.forEach(System.out::println);
}
}