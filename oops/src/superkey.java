

public class superkey {
}

	
		class  A{
			int age = 25;
			A(int a){
				System.out.println("I am construtor of A class ");
			}
		}
		 class superkeyword extends A{
			int age =36;
			superkeyword(){
				super(36);
				int age=69;
				System.out.println("I am construtor of superkeyword class"+super.age);
			}
		
		public static void main(String[] args) {
			superkeyword a=new superkeyword();
			System.out.println();
		}
		}

	


