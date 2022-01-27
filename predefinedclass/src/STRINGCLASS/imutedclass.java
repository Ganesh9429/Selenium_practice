package STRINGCLASS;

final class imutedclass {
	final String name;
	final int age;
	imutedclass(String s,int a){
		name =s;
		age = a;
		
	}
	
	String getname() {
		return name;
	}
	int getage() {
		return age;
	}
	
	
	public static void main(String[] args) {
		imutedclass i = new imutedclass("ganesh",50000);
		System.out.println("name is "+i.getname());
		System.out.println("salary is "+i.getage());
	}

}
