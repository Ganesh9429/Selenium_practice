package STRINGCLASS;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s3 = "Rohit Sharma RO-SUPER-HIT SHRAMA father of daddy 100";
	//	System.out.println(s3);
		String[] ro = s3.split(" ");
	/*	for(String r:ro) {
			System.out.println(r);
		}*/
		String temp="";
		for(int i = ro .length-1;i>=0;i--) {
			temp=temp+" "+ro[i];
			
		}
		System.out.println(temp.trim());
		
	}

}
