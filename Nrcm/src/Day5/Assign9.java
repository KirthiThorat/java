package Day5;
interface Rice{
	void indhri();
}
interface Puri{
	void wheat();
}
interface Tortilla{
	void maida();
}
class Food implements Rice,Puri,Tortilla {
	public void rice() {
		System.out.println("regular,fat");
	}
	public void indhri() {
		System.out.println("tasty");
	}
	public void wheat() {
		System.out.println("whitesh brown");
	}
	public void maida() {
		System.out.println("Sticky");
	}
}
interface Handmade{
	void added();
}
class machine extends Food implements Handmade{
	public void oily() {
		System.out.println("fat");
	}
	public void uncooked() {
		System.out.println("raw");
	}
	public void added() {
		System.out.println("cream");
	}
}

public class Assign9 {

	public static void main(String[] args) {
		machine m5=new machine();
		Food f1=new Food();
		m5.added();
		m5.oily();
		f1.wheat();
		f1.indhri();
		f1.maida();
		f1.rice();

	}

}



