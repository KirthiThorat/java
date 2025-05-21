package Day5;
interface Iiii1{
	void add();
	
}
interface I2{
	void sub();
}

public class Interfacetwo implements Iiii1,I2 {
	public void add() {
		System.out.println("hey");
	}
	public void sub() {
		System.out.println("supiee");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfacetwo i1=new Interfacetwo();
		i1.add();
		i1.sub();

	}

}
