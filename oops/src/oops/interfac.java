package oops;
interface intre{
	
	
}
public interface interfac extends intre{
	void display();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age =25;
System.out.println(age);
Animal1 d=new Animal1();
d.move();

	}
class begin implements interfac {
	public  void display() {
		System.out.println("overriding");
	}
	
}
}
