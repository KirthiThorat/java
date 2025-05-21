package Day5;

public class Overriding {

	public static void main() {
		
		System.out.println("hi");
		// TODO Auto-generated method stub

	}
	public static void main(int a) {
		System.out.println(a);
		
	}
	public static void main(int a, int b) {
		System.out.println(a+b);
		
	}
	public static void main(int a,int b, double d1) {
		System.out.println(a+b-d1);
	}
	public static void main(String[] args) {
		Overriding o1=new Overriding();
		o1.main();
		o1.main(4);
		o1.main(6 , 8);
		o1.main(3, 56, 2.5);
	}

}
