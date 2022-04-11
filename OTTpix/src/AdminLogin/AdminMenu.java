package AdminLogin;
import java.util.*;

import AdminChangeTopMovies.ChangeTopMovies;
import AdminMovieUnavaliable.AdminMovieUnavaliable;
public class AdminMenu {
public static void display() {
	System.out.println("Login successful"+"\n");
	System.out.println("Welcome Admin.");
	System.out.println("Menu");
	System.out.println("===");
	System.out.println("1) Change Top 5 Movies");
	System.out.println("2) Mark movie unavailable");
	System.out.println("3) Modify movie details");
	System.out.println("4) Logout");
	Scanner sc=new Scanner(System.in);
	System.out.println("Select an option:");
	int option = sc.nextInt();
	if(option==1) {
		ChangeTopMovies.display();
	}else if(option==2) {
		AdminMovieUnavaliable.display();
	}else if(option==3) {
		AdminUpdateMovieDetils.AdminUpdateMovieDetils.display();
	}else if(option==4) {
		System.out.println("Logged out Successfully");
		Initial.MainMenu.display();
	}
}
}