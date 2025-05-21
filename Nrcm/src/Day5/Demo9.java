package Day5;

public class Demo9 {
	void add() {
		System.out.println("hi");
	}
	void add(int a) {
		System.out.println(a);
	}
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(int a,int b,double d1) {
		System.out.println(a+b-d1);
	}

	public static void main(String[] args) {
		Demo9 d1=new Demo9();
		d1.add();
		d1.add(34);
		d1.add(6,7);
		d1.add(3, 5, 6.6);
		// TODO Auto-generated method stub

	}

}
