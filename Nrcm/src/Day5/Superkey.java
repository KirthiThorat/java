package Day5;
class Sample12{
	public Sample12() {
		System.out.println("good evening");
	}
	int x=10;
	void print() {
		System.out.println("hey");
	}
}

public class Superkey extends Sample23 {
	public Superkey() {
		super();
	}
	void show() {
		int y=45;
		super.print();
		System.out.println(super.x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superkey s3=new Superkey();
		s3.show();

	}

}
