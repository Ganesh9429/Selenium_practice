package oops;

public class inheritance {
int exp =1;
double sal=3.5;
	public static void main(String[] args) {
System.out.println("excess first satic members"+B.age);
C a = new C();
System.out.println("now excess non stastic members ....");
System.out.println(a.exp);
System.out.println(a.sal);
System.out.println(a.empid);
System.out.println(a.salary);
System.out.println(a.dob);
System.out.println(a.bounous);
B c=new C();
System.out.println(""+c.salary);




	}

}
class B extends inheritance {
	static int age =25;
	int empid =12345;
	double salary=50000;
}
class C extends B 
{
	double dob = 12345;
	byte bounous = 1;
	
			
}