
public class throwkey {

	public static void validAge(int age) {
	    if(age<18) {  
            //throw Arithmetic exception if not eligible to vote  
            throw new ArithmeticException("Person is not eligible to vote");    
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
    }  
	public static void main(String[] args) {
		validAge(20);
		validAge(17);
	}

}
