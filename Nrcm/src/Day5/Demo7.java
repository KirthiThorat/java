package Day5;
class Fruits{
	void Benifits() {
		System.out.println("healthy");
	}
}
class Apple extends Fruits{
	void color() {
		System.out.println("red");
	}
}
class Mango extends Fruits {
	void price() {
		System.out.println("100 kg");
	}
}
class Banana extends Fruits {
	void taste() {
		System.out.println("mild");
	}
}


public class Demo7 {

	public static void main(String[] args) {
		Apple a1=new Apple();
		Mango m1=new Mango();
		Banana b1=new Banana();
		a1.Benifits();
		a1.color();
		m1.Benifits();
		m1.price();
		b1.Benifits();
		b1.taste();
		

	}

}
