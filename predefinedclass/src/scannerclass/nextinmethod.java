package scannerclass;

import java.util.Scanner;

public class nextinmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your First Name :-");
		String Fname = s.next();
		System.out.println("Enter your last Name :-");
		String Lname = s.next();
		System.out.println("Enter your Age :-");
		int Age = s.nextInt();
		System.out.println("Enter your Mob. no. :-");
		long mob = s.nextLong();
		System.out.println("Enter your Gender :-");
		String gender = s.next();

		System.out.println("First name is :" + Fname);
		System.out.println("Last name is :" + Lname);
		System.out.println("Age  :"+ Age);
		System.out.println("Mob no.  = :"+ mob);
		System.out.println("Gender  :"+gender);
		s.close();
		
		
	}

}
