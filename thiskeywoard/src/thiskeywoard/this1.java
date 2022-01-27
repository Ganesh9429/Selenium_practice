package thiskeywoard;

public class this1 {
	int age = 25;

	void display() {
		int age = 55;
		System.out.println("age value" + age);
		System.out.println(" age" + this.age);
	}

	public static void main(String[] args) {
		this1 a1 = new this1();
		a1.display();
		System.out.println("age" + a1.age);
	}

}
	