package AdminChangeTopMovies;
import java.util.*;

import AdminLogin.AdminMenu;
import Movie.jdbc.CurrentTopMovies;
import Movie.jdbc.MovieDao;
import Movie.jdbc.MovieListModify;
import MovieLists.Movie;
import adminSearchMovie.AdminSearchMovie;
public class ChangeTopMovies {
	public static void display() {
		System.out.println("Current top 5 movies");
		System.out.printf("%4s %-40s\n", "id", "Name");
		System.out.printf("%4s %-40s\n", "===", "====");
		CurrentTopMovies dao = new CurrentTopMovies();
		List<Movie> movie=dao.findAll();
		movie.forEach(System.out::println);
		System.out.println("Select a movie to remove from Top 5 (Enter Id):");
		Scanner sc= new Scanner(System.in);
		int id = sc.nextInt();
		AdminSearchMovie.display();
			System.out.println("Select movie to add to Top 5 (Enter Id):");
			int add= sc.nextInt();
			MovieListModify modify = new MovieListModify();
			List<Movie> update =modify.delete(id, add);
			System.out.println("Top 5 movies modified successfully."+"\n");
			System.out.println("Top 5 Movies after changes");
			System.out.println("==========================");
			movie.forEach(System.out::println);
			AdminMenu.display();
		}
}
