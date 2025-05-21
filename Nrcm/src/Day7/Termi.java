package Day7;

public class Termi extends Thread{
	public static void main(String[] args) {
		Termi t5=new Termi();
		Thread t6=new Thread(t5);
		t6.start();
		System.out.println("hi");
		t6.sleep(20000);
		System.out.println("hey");
		
	}
}
