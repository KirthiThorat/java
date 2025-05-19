package cdc2;
interface Baking{
	void ingridents();
}
interface Cakes{
	void listofitems();
	
}
class B4{
	void Cookies() {
		System.out.println("Cookies are:Salted Caramel,Chocochip,Plain");
	}
}
class B5 extends B4 implements Baking,Cakes{
	public void cake() {
		System.out.println("cakes are: Red velvet,truffle,strawberry custard");
	}
	public void Donuts() {
		System.out.println("Donuts are: Rassberry,Blueberry,Cream cheeese");
	}
	public void Croissant() {
		System.out.println("Croissant are: Chocolate,Pistachio,Vanilla");
	}
	public void ingridents() {
		System.out.println("Sweet");
	}
	public void listofitems() {
		System.out.println("milk,egg");
	}
}
class B3 extends B5{
	public void profit() {
		System.out.println("20000");
	}
}

public class Assis5 {
	public static void main(String[] args) {
		B4 t6=new B4();
		B5 t7=new B5();
		B3 t3=new B3();
		t7.cake();
		t7.Cookies();
		t7.ingridents();
		t7.listofitems();
		t6.Cookies();
		t3.profit();
		t3.cake();

	}

}



