import java.util.Scanner;

public class exception {

	public static void main(String[] args) {
		Scanner i = new Scanner (System.in);
		System.out.println("enter no :-");
		double j = i.nextDouble();
		System.out.println(j);
		try {
			int age = 52/0;
			System.out.println(age);
		}catch(Throwable e) {
			System.out.println(e);
		}
		System.out.println("program ends***********************");
	}

}
