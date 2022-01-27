package wrapingclass;

public class boxingunboxing {

	public static void main(String[] args) {
		int age = 22;
		System.out.println("boxing  data type *************");
		Integer a1 = new Integer(age);
//explicit 
//or
		Integer a2 = new Integer(22);
//or
		Integer a3 = age;// implicit

		System.out.println(a1);
		System.out.println(a2);

		System.out.println(a3);
System.out.println("unboxing data type *******************");
 int b1 = a1.intValue();
 System.out.println(b1==a1);
 System.out.println(a1.equals(b1));
	}

}
