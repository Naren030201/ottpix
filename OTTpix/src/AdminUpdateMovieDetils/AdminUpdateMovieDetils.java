package AdminUpdateMovieDetils;

import java.util.Scanner;

import AdminLogin.AdminMenu;
import adminSearchMovie.AdminSearchMovie;

public class AdminUpdateMovieDetils {
	public static void display() {
		AdminSearchMovie.display();
		System.out.println("Select movie to update (Enter Id):");
		Scanner sc= new Scanner(System.in);
		int id = sc.nextInt();
		System.out.printf("What is the updated name for movie with Id "+"%d?");
		String updated_name= sc.nextLine();
		//movie details should be changed with the respective id given
		System.out.println("Movie details updates successfully.");
		AdminMenu.display();
	}
}
