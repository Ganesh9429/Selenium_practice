package objectclass;

class obj {
	void display() {
		System.out.println("Method");
	}

}

public class fullyqualified extends obj {
	static int age = 25;
	int rollno;

	public static void main(String[] args) {
		fullyqualified s1 = new fullyqualified();
		System.out.println(s1);
		System.out.println(s1.toString());
		obj o2 = new obj();
		System.out.println(o2);
		obj o1=new fullyqualified();
		System.out.println(o1);
		System.out.println("************hashcode method*******");
		System.out.println(s1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o1.hashCode());
	}

}
