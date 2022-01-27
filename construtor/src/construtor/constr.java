package construtor;

public class constr {
		int i=10;
		constr(){
			System.out.println("Running Class constr constructor..");
		}
		void display() {
			System.out.println("I am display() of class constr.");
		}public static void main(String args[]) {
			System.out.println("Main() of Class Cons5 is started...");
			constr a1=new constr();
			a1.display();
			System.out.println("Class A global varibale i = "+a1.i);
			X x1=new X();
			x1.display();
			System.out.println("Class X global varibale j = "+x1.j);	
			Cons5 c1=new Cons5();
			c1.display();
			System.out.println("Main() of Class Cons5 is ends here...");
		}
	}
	class X{
		int j=10;
		X(){
			System.out.println("Running Class X constructor..");
		}
		void display() {
			System.out.println("I am display() of class X.");
		}
	}
	 class Cons5 {
		
		void display() {
			System.out.println("I am display() of class Cons5.");
		}
		
	}