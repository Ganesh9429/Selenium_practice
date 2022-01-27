package recallmethod;

public class nonststicmethod {
	public double getmulti(int no1,int no2) {

	return (no1*no2);
	}


	public static void main(String[] args) {
		nonststicmethod v1=new nonststicmethod();
		System.out.println(v1.getmulti(50, 1));
	}

}
