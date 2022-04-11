package Menu;
import java.util.*;
import ViewTopMovies.*;
import WishLIst.WishlistAvaliable;
import SearchMovie.*;
import Initial.MainMenu;
public class Menu {
public static void display() {
	System.out.println("Menu");
	System.out.println("===");
	System.out.println("1) View Top 5 Movies");
	System.out.println("2) Search Movies");
	System.out.println("3) Your Wish List");
	System.out.println("4) View History");
	System.out.println("5) Logout");
	System.out.println("Select an option:");
	Scanner sc= new Scanner(System.in);
	int option = sc.nextInt();
	if(option==5) {
		MainMenu.display();
	}
	else if(option==1) {
		ViewTopMovies.display();
	}
	else if(option==2) {
		SearchMovie.display();
	}
	else if(option==3) {
		WishlistAvaliable.display();
	}
	else if(option==4) {
		WatchHistory.WatchHistory.display();
	}else if(option==5){
		Logout.Logout.display();
	}
	}
}
