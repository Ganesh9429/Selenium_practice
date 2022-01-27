
public class vari {
static int empid=51246;
int roll=45;
static double sall=87000;
double sel=123456;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("access static variable "+vari.empid);
System.out.println("sall"+sall);
System.out.println("accessing non static gloable variable ");
vari v1= new vari();
System.out.println(v1.roll);
v1.roll=46;
System.out.println(v1.roll);
	}

}
