package oops;

public class inheri {
inheri(int b){
	System.out.println(" cons..... of inheri"+b);
}
	public static void main(String[] args) {
		friute a = new friute();
		a.display(25);
		a.display();
		
	}

}
class apple extends inheri{
	void display() {
		System.out.println("i AM METHOD OF Apple class ");
	}
	apple(){
		super(35);
	System.out.println("i am const of apple class ");	
	}
}
class friute extends apple
{void display (int age){
	System.out.println(" Display method "+age);
}
	
	
	
	
	
}