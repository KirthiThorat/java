package Day5;
class Sample23{
	public Sample23() {
		System.out.println("good evening");
	}
	int x=10;
	void print() {
		System.out.println("hey");
	}
}

public class Hey extends Sample23 {
	public Hey() {
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
		Hey s3=new Hey();
		s3.show();

	}

}
