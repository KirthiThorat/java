package Day5;
class Bike{
	void speed() {
		System.out.println("250 km per hr");
	}
}
class Bmw extends Bike {
	void rev() {
		System.out.println("1000cc");
	}
}
class Model extends Bmw {
	void price() {
		System.out.println("just 30 lakhs");
	}
}
public class Demo6 {

	public static void main(String[] args) {
		Model M1= new Model();
		M1.price();
		M1.rev();
		M1.speed();
		

	}

}
