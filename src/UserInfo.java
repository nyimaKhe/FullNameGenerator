import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UserInfo {

	public static void main(String[] args) {
		String[] fname = new String[4];
		String[] lname = new String[4];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 4 first Names: ");
		for (int i = 0; i < fname.length; i++) {
			fname[i] = scan.nextLine();
		}
		
		System.out.println("Now Enter four Last Name: ");
		for (int i = 0; i < fname.length; i++) {
			lname[i] = scan.nextLine();
		}
		
		List<User> users = new ArrayList<User>();
		for (int i = 0; i < fname.length; i++) {
			User u = new User();
			u.setfName(fname[i]);
			u.setlastName(lname[i]);
			users.add(u);
		}
		
		for (User u: users) {
			System.out.println(u.getFullName());
		}
		
	}

}
