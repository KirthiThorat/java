package cdc2;
interface I7{
	void butter();
}
interface I8 extends I7{
	void cream();
}
class cl1 implements I8{
	public void butter() {
		System.out.println("almond");
	}
	public void cream() {
		System.out.println("vanilla");
	}
	public void flour() {
		System.out.println("wheat");
	}
}
class cl2 implements I8{
	public void butter() {
		System.out.println("peanut");
	}
	public void cream() {
		System.out.println("chocolate");
	}
	public void color() {
		System.out.println("white");
	}
}	
public class Assis2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cl1 l=new cl1();
		cl2 l2=new cl2();
		l.butter();
		l.cream();
		l.flour();
		l2.butter();
		l2.cream();
		l2.color();
	}
}	

