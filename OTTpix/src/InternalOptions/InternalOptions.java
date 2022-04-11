package InternalOptions;
import SelectMovieOption.*;
import java.util.Scanner;

public class InternalOptions {
	public static void options() {
		Scanner sc= new Scanner (System.in);
		int id= sc.nextInt();
		System.out.println("1) Add movie to Wish List");
		System.out.println("2) Play movie");
		System.out.println("Select an option:");
		int option = sc.nextInt();
		if(option==1) {
			SelectMovieOption.AddtoWishList.display();
		}else if(option==2) {
			SelectMovieOption.PlayMovie.display();
		}
	}
}
