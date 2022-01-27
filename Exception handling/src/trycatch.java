
public class trycatch {

	public static void main(String[] args) {
		int[] a = new int[3];
		
	//	System.exit(0);because of this statement progrme is not excuite.
	try {
					a[3] = 25;
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("exception name :-"+e);
	}finally {
		System.out.println("finally block is always excute if exception handling or not");
	}
	System.out.println("programe end*************");
	}
}
