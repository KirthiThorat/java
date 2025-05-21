package Day5;
interface I1{
	void add();
	void sub();
}

public class Interface implements I1 {
	public void add() {
		System.out.println("hey");
	}
	public void sub() {
		System.out.println("supiee");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface i1=new Interface();
		i1.add();
		i1.sub();

	}

}
