package oops;

public class practice {
	int empAge;
	practice(int age){
		empAge=age;
	}
	void display(int i) {
		empAge=i;
		System.out.println(empAge);
	}
	void display() {
		empAge=50;
		System.out.println(empAge);
	}
	public static void main(String[] args) {
		SampleDemo s1=new SampleDemo();
		System.out.println(s1.empAge);//
		s1.display(35);
		System.out.println(s1.empAge);//
		s1.display();
		System.out.println(s1.empAge);
}

} class SampleDemo extends practice{
	SampleDemo() {
		super(15);
	}}
	