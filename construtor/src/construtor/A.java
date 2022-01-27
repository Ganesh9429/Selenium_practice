package construtor;

public class A {
int k=19;
A(){
	System.out.println(" constr.... of class a");
}
A(int g){
	System.out.println(" constr.... of class 25");
}
void display()
{System.out.println(" display method of class a");}
	public static void main(String[] args) {
	System.out.println(" programe starts************-------------->");
	A a1 = new A(25);
	a1.display();
	System.out.println("2 ND CONSTRUCTOR CALL"+a1.k);
	b b1 =new b();
	b1.display();
	System.out.println("3rd constructor call "+b1.i);
	c c1 = new c();
	c1.display();
	System.out.println("program ends ------------------>");

	}

}
class b{
	int i = 10;
b(){
	System.out.println("const.... call b");
}
	
	void display ()
	{System.out.println("method call in b class");}
	
	
	
}
class c{
	
	int j = 15;
	c(){
		System.out.println("const.... call c");
	}
		
		void display ()
		{System.out.println("method call in c class");}
		

	
	
}