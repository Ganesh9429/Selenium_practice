package oops;

class vehical{
	int age =25;
	double sall=50000;
	
	vehical(){
		System.out.println(" i am const.. of vehical ");
	}
	void method () {
		System.out.println("i am method ");
	}
	
	
	
	
	
	
}
public class inherit extends vehical {
	int age=26;
	


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehical v1 = new inherit();
	}

}
