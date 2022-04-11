package Initial;

import java.util.*;
public class Signup {
public static void display() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Signup");
	System.out.println("===");
	System.out.println("Name:");
	String name = sc.nextLine();
	System.out.println("Mobile:");
	int mobile = sc.nextInt();
	System.out.println("Password");
	String password = sc.next();
	if() {//equals method implemented so that if user alerady exists need to trow an error
		System.out.println("User Alerady exist please Login");
		MainMenu.display();
	}else {
	System.out.println("Signup Successfull. Please Login");
	MainMenu.display();
}
}
}