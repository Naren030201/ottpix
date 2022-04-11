package SearchMovie;
import java.util.*;
import InternalOptions.*;
import Movie.jdbc.MovieSearch;
import MovieLists.Movie;
public class SearchMovie {
public static void display() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Find Movie");
	System.out.println("===");
	System.out.println("Seacrh Movie");
	String Keyword = sc.nextLine();
	MovieSearch search = new MovieSearch();
	List<Movie> movie=search.findAll(Keyword);
		System.out.printf("Search result for "+"%s\n" , Keyword);
		Menu.Menu.display();
	}
}
