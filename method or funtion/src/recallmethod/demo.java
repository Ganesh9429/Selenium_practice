package recallmethod;

public class demo {
	int age;
	void display() {
		System.out.println("I am display() of Method03 class and age value is: "+age);
	}
	void display(int a) {
		age=a;
		System.out.println("I am display(int) of Method03 class and age value is: "+age);
	}
	public static void main(String[] args) {
		
		demo m2=new demo();
		System.out.println("age: "+m2.age);
		m2.display();
		m2.display(25);		
		System.out.println("age: "+m2.age);		
		System.out.println("******************************");
		demo m3=new demo();
		System.out.println("age: "+m3.age);
		m3.display(75);
		System.out.println("age: "+m3.age);
		m3.display();		
	    }
	}


