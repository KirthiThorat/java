package Day5;
class test3 {
	void add() {
		System.out.println("hi");
	}
}
public class Overridingoriginal extends test3 {
	void add() {
		System.out.println("hello");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overridingoriginal o2= new Overridingoriginal();
		o2.add();

	}

}