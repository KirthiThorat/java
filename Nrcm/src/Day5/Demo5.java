package Day5;
class Animal{
	void sleep() {
		System.out.println("sleeping");
	}
}
class Dog extends Animal {
	void bark() {
		System.out.println("dog is barking");
	}
}
public class Demo5 {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.bark();
		d1.sleep();
		// TODO Auto-generated method stub

	}

}
