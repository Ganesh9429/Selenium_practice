package Encapsulation;

class demo3 {
	private String college = "DIEMS";

	public String getcollege() {

		return college;
	}

}

public class encap {

	public static void main(String[] args) {
		demo3 s1=new demo3();
		System.out.println(s1.getcollege());
	}

}//a fully encapsulation class is the all variables declered as private then and that we can say fully encapsulation class.
