package STRINGCLASS;

public class methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "core java basic";
		System.out.println("for upper and lower case method");
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		//replace with method
		System.out.println(s1.replace("a","b"));
		System.out.println(s1.replaceFirst("java", "bava"));
		System.out.println(s1.replaceFirst("a", "j"));
		String s2 = "";
		System.out.println(s2.isEmpty());
	}

}
