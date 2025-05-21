package Day_3;

abstract class Abstractcla {
	abstract void add();
}
class Demo extends Abstractcla {
	public void add() {
		System.out.println("hi");
	}
	public static void main(String[] args) {
		Demo d1=new Demo();
		d1.add();
	}
		
}