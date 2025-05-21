package Day5;
interface Ii4{
	void genre();
	
}
interface Ii5{
	void action();
}
interface Iii6 extends Ii4,Ii5{
	void hero();
}

public class Assign1 implements Iii6 {
	public void genre() {
		System.out.println("dark");
	}
	public void action() {
		System.out.println("suspense");
	}
	public void hero() {
		System.out.println("Sidharat");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assign1 i1=new Assign1();
		i1.genre();
		i1.action();
		i1.hero();
	}

}


