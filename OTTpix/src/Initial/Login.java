package Initial;
import Menu.Menu;

import java.util.*;

import AdminLogin.AdminMenu;
public class Login {
public static void display() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Login");
	System.out.println("===");
	System.out.println("Mobile:");
	int mobile = sc.nextInt();
	System.out.println("Passowrd:");
	String password=sc.next();
	String AdminPassword="pass";
	if(mobile==9 && password.equals(AdminPassword))
	{//mobie is 9 and password is pass admin account should display
	AdminMenu.display();
	}
	/*else if() {//equals method should be implemented to compare the mobile and password with database
	System.out.println("Login successful.");
	System.out.println("Welcome Back"+" ");//user name should be printed here
	Menu.display();
	}*/
	else {
		System.out.println("!!! Incorrect Mobile or Password. Please try again.");
		Login.display();
	}
	}
}
