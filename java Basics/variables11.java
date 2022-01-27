class variables11 
{	double empid =142348;
	int age=22;
	float pkg =6.0f;
	public static void main(String[] args) 
	{
		variables11 g1 = new variables11();
		System.out.println("empid :"+g1.empid);
		System.out.println("empid :"+g1.age);
		System.out.println("empid :"+g1.pkg);
		System.out.println("Hello World!");
		g1.empid =123456;
		g1.age=23;
		System.out.println("Hello World!"+g1.empid);
		System.out.println("Hello World!"+g1.age);
		variables11 g2 = new variables11();
		g2.empid=482314;
		System.out.println("Hello World!"+g2.empid);
	}
}
