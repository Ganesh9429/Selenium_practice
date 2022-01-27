package Encapsulation;

class encap1 {
	private double clgid = 124536;
	private String college = "diems";

	public double getclgid() {
		return clgid;
	}

	public String getcollege() {
		return college;
	}

	public void setclgid(double clgid) {
		this.clgid = clgid;
	}

	public void setcollege(String college) {
		this.college = college;
	}

}

public class gstsetmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encap1 s1 =new encap1();
		System.out.println(s1.getclgid());
		System.out.println(s1.getcollege());
		s1.setclgid(142348);
		s1.setcollege("MGM");
		System.out.println(s1.getclgid());
		System.out.println(s1.getcollege());
		double updatesall=s1.getclgid()+1546;
		System.out.println(updatesall);
	}
	
	

}
