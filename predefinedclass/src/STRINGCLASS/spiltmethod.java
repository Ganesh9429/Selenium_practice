package STRINGCLASS;

public class spiltmethod {

	public static void main(String[] args) {
		String s1 = "I am from Maharashtra";
		System.out.println("Actual string :-" + s1);
		String[] strarr = s1.split(" ");
		System.out.println(strarr[1]);
		System.out.println(s1.split(" "));
		System.out.println("*************************************************");
		for (String s : strarr) {
			System.out.println(s);
		}
		String s2 = "I am from Sambhajinagar";
		System.out.println(s2);
		String[] ss = s2.split(" ", 5);
		for (String a : ss) {
			System.out.println(a);
		}
String s3 = "Rohit Sharma RO-SUPER-HIT SHRAMA father of daddy 100";
System.out.println(s3);
String[] ro = s3.split(" ");
for(String r:ro) {
	System.out.println(r);
} String temp= "";
for (int i=ro.length-1; i >= 0;i--) {
	temp = temp+" "+ro[i];
}
System.out.println(temp.trim());
// trim is used for remove additional spaces in starting and ending

	}
}
