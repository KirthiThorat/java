package Day_2;
interface I4{
	void genre();
	
}
interface I5{
	void action();
}
interface I6 extends I4,I5{
	void hero();
}

public class Intern implements I6 {
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
		Intern i1=new Intern();
		i1.genre();
		i1.action();
		i1.hero();
	}

}

