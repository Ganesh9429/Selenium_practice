package oops;

interface apple1 {
	int age =22;
	void display();

	void taste();

}

interface banana {
	void bana();
}


public class interface1 implements apple1, banana { // we can do multi. inheritance using interface not using class
	public void bana() {
		System.out.println(" test ");
	}

	public void display() {
		System.out.println(" IA am method ");
	}

	public void taste() {
		System.out.println("   ");
	}

	public static void main(String[] args) {
		apple1 v1 = new interface1();
		v1.display();
		System.out.println(v1.age);
		
		// TODO Auto-generated method stub

	}

}
