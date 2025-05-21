package Day6;
class Sam{
	private static void show() {
		System.out.println("yo");
	}
	static class Test12{
		static void print() {
			System.out.println("sup");
			show();
		}
	}
}
public class Sample9 {

	public static void main(String[] args) {
		Sam.Test12.print();

	}

}
