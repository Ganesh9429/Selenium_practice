package recallmethod;

public class practice {
static int age=25;
	
	static void sum(int num1,int num2) 
	{
		System.out.println("Addition of two numbers: "+(num1+num2));
	}
	static double addition(int num1,int num2, int num3) 
	{
		return (num1+num2+num3);
	}
	public static void main(String[] args) {
		
		practice.sum(20, 30);
		System.out.println("Addtion of three numbers: "+practice.addition(25, 50, 75));
				//or
		double res=practice.addition(250, 12, 50);
		System.out.println("Sum of three numbers: "+res);

}
}
