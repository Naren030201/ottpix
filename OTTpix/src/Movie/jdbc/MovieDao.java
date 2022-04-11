package Movie.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import MovieLists.*;
public class MovieDao {
public List<Movie> findAll(){
	String sql= "select * from movie";
	List<Movie> movies = new ArrayList<>();
	try(
			Connection connection = Util.getConnection();
			PreparedStatement stmt = connection.prepareStatement(sql);
			){
		ResultSet rs= stmt.executeQuery();
		while(rs.next()) {
			Movie movie = new Movie();
			movie.setId(rs.getInt("id"));
			movie.setMovie_name(rs.getString("movie_name"));
			movies.add(movie);
		}
		
	}catch(SQLException e) {
		Util.displayMessage(e);
	}
	return movies;
}
}
