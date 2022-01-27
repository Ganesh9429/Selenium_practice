package oops;

abstract class bike {
	final void bs6norms(double d) {
		System.out.println("you must follow bs6 norms");
	}

	abstract void speed();

}
 class honda extends bike {
 void speed() {System.out.println("Speed of bike is as per prise");
	super.bs6norms(26.5);

}}

public class abstractcl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		honda a = new honda();
		a.speed();
	}

}
