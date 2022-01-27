package oops;

class a {
	int a = 256;
	void displya () {
		
	}
	void displya (int s) {
		
	}
	void reversr(int num) {
		int rev = 0;
		while (num != 0) {
			int digit = (num % 10);
			rev = rev * 10 + digit;
			num /= 10;
		}
		System.out.println(" reverse no." + rev);
	}
	void palidrome(int n) {
		int r,sum=0,temp;    
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		} 
	void leap(int year) {
	    boolean leap = false;

	    if (year % 4 == 0) {

	      if (year % 100 == 0) {

	        if (year % 400 == 0)
	          leap = true;
	        else
	          leap = false;
	      }
	      
	      else
	        leap = true;
	    }
	    	    else
	      leap = false;
	    if (leap)
	      System.out.println(year + " is a leap year.");
	    else
	      System.out.println(year + " is not a leap year.");
	  }
	}
	class b extends a{
		void reversr(int num) {
		int rev = 0;
		while (num != 0) {
			int digit = (num % 10);
			rev = rev * 10 + digit;
			num /= 10;
		}
		System.out.println(" reverse no." + rev);
	}
	void palidrome(int n) {
		int r,sum=0,temp;    
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		} 
	void leap(int year) {
		super.leap(2021);
	    boolean leap = false;

	    if (year % 4 == 0) {

	      if (year % 100 == 0) {
	        if (year % 400 == 0)
	          leap = true;
	        else
	          leap = false;
	      }
	      	      else
	        leap = true;
	    }
	    	    else
	      leap = false;
	    if (leap)
	      System.out.println(year + " is a leap year.");
	    else
	      System.out.println(year + " is not a leap year.");
	  }	
	}

public class assig {

	public static void main(String[] args) {
		b a1 = new b();
		a1.leap(2020);
		a a2=new b();
		System.out.println(a2.a);
	}
}