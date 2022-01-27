package Encapsulation;

class foo {

	int n = 50;
}

class bar extends foo {

	int n = 10;
}

public class inplicitexplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		foo d1 = new bar();
		System.out.println(d1.n);
	}

}
