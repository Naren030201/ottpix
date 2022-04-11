package Initial;


import java.util.*;

public class MainMenu {

	public static void display() {
		System.out.println("Pix OTT App"+"\n");
		System.out.println("Main Menu");
		System.out.println("===");
		System.out.println("1) Signup");
		System.out.println("2) Login");
		System.out.println("3) Exit");
		Scanner sc = new Scanner(System.in);
		System.out.println("Select an option:");
		int option = sc.nextInt();
		if(option==1) {
			Signup.display();
		}
		if(option==2) {
			Login.display();
		}
		if(option==3) {
		System.out.println("Exiting App.");
		}
	}

}
