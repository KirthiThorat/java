package Day5;

public class Demo10 {
	void show() {
		System.out.println("hi");
	}
	
	void show (double d1, double d2) {
		System.out.println(d1-d2);
	}
	void show(String s1, String s2) {
		System.out.println(s1.concat(s2));
	}

	public static void main(String[] args) {
		Demo10 d1=new Demo10();
		d1.show();
		d1.show(6.8 ,7.9);
		d1.show("hi", "heya");

	
	}

}
