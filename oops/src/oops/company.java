package oops;

public class company {
	int age = 22;
	double salary = 50000;
	final static int empid = 1423;
	company(int a)
	{
		System.out.println(""+a);
	}
	company(){
		this(25);
		System.out.println("I am construtor ");
	}
	void display() {
		int age = 25;
		System.out.println(" I am method of 1st" + (this.age));
		
	}
	void display(int a) {
		System.out.println("I am try to overloading ");
		
	}
}
class employee extends company{
	int age = 22;
	double salary = 50000;
	employee(int h)
	{	super();
		System.out.println(" const...........");
	}
	employee(){
	this(2);
	}
	void method()
	{ int age =19;
		System.out.println(" i am method of 2 nd class"+this.age);
	}
	void method(int z)
	{int age=23;
		System.out.println(" I am try to overloading method"+super.age);
	}
	
	public static void main(String[] args)
	{
		employee a=new employee();
		a.display();
		a.display(26);
		a.method();
		a.method(96);

	}
	
	
	
	
	
	
}