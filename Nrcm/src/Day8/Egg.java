package Day8;

public class Egg implements Runnable{
	public void run() {
		System.out.println("yo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread (new Egg());
		t1.start();

	}

}
