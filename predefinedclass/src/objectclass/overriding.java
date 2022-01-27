package objectclass;

public class overriding extends Object {
	void display() {
		System.out.println("I am display() of class Demo123");
	}

	public static void main(String args[]) {
		ObjectClass2 s = new ObjectClass2();
		// Below two statements are equivalent
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println(s.hashCode());// 100
		s.display();//

		overriding d2 = new overriding();
		System.out.println(d2.hashCode());
		System.out.println(s.hashCode());
		System.out.println("equal method to comapire");
		System.out.println(s.equals(d2));
	}

}

class ObjectClass2 extends overriding {
	static int last_roll = 100;
	int roll_no;

	// Constructor
	ObjectClass2() {
		roll_no = last_roll;// 100
		last_roll++;// 101
	}

	@Override
	void display() {
		System.out.println("I am display() of class ObjectClass2");
	}

	public int hashCode() {
		return roll_no;

	}
}

// Driver code
