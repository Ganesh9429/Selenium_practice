package STRINGCLASS;

public class STRINGMETHOD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "mumbai";
		String s2 = "mumbai";
		String s3 = "Banglour";

		System.out.println(s1);// in object class tosting method print fullyqualifiedclass @ hexadecimal adress
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(" to check length of string ****");
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		System.out.println("another method in string");
		System.out.println(s1.endsWith("bai"));
		System.out.println(s2.endsWith("lour"));
		System.out.println(s3.endsWith("lour"));
		System.out.println("Start with method*************");
		System.out.println(s1.startsWith("mum"));
		System.out.println(s2.startsWith("ban"));
		System.out.println(s3.startsWith("ban"));
		System.out.println("contain method*******************");
		System.out.println(s1.contains("MUM"));
		System.out.println(s2.contains("b"));
		System.out.println(s3.contains("B"));
		System.out.println(" equal method ***");
		System.out.println(s1.equals(s2));// compaireing based on their values
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s2);// copmaireing based on their address

	}

}
