package STRINGCLASS;

public class palidrome {
	public static void main(String args[])
	   {
	     String name = "radar";
	     String temp="";
	     for(int i =name.length()-1;i>=0;i--) {
	    	 temp=temp+name.charAt(i);
	     }
	     if(name.equals(temp)){
	    	 System.out.println("Is a palidrome");
	     }else {
	    	 System.out.println("Is not a palidrome");
	     }
	    
	 
	  
	   }
	}
