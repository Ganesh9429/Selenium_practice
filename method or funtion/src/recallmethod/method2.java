package recallmethod;

public class method2 {
	static void addTwoNum(int a,int b) {
		int res=a+b;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("res: "+res);
	}
	static void multification(int a,int b)
	{ double res = (a*b);
	System.out.println("a: "+a);
	System.out.println("b: "+b);
	System.out.println("res: "+res);
	
	System.out.println("calulaction is "+res);
	}

	public static void main(String[] args) {
			
		method2.addTwoNum(10, 20);
		method2.addTwoNum(100, 120);
		method2.addTwoNum(110, 2);
		method2.addTwoNum(1, 20);
		System.out.println("*****************************************");
		method2.multification(10, 20);
		method2.multification(100, 120);
		method2.multification(110, 2);
		method2.multification(1, 20);
	}

}
