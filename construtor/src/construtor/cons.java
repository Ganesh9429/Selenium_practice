package construtor;

public class cons {
double j =10;
cons(){
	

}
cons(double g)
{System.out.println("----------------->");
j=g;

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
cons a1 = new cons(15.34);
System.out.println("new value "+a1.j);
cons a2 = new cons();
System.out.println("using old value"+a2.j);

	}

}
