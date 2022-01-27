package recallmethod;

public class methodwithnonstatic {
     int age=25;
	double addition(int num1,int num2, int num3)
	 {  System.out.println("sum of 3 no"+(num1+num2+num3+age));
		 return (num1+num2+num3+age);
	 }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			methodwithnonstatic v1 =new methodwithnonstatic();
			v1.addition(30, 40, 50); 
	}

}
