package thiskeywoard;

public class thistatement {

	thistatement() {
		this(25);
		System.out.println("Constructour is zero para....");
	}

	thistatement(int a) {
		this('A');
		System.out.println("Constructour is int para....");
	}

	thistatement(char c) {
		this(25.25);
		System.out.println("Constructour is char para....");
	}

	thistatement(double d) {
		this(25, 26);
		System.out.println("Constructour is double para....");
	}

	thistatement(int b, int g) {
		System.out.println("Constructour is 2 int para....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thistatement a1 = new thistatement();
	}

}
