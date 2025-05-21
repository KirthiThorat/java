package Day8;

public class Runnablemet implements Runnable {
	public void run() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnablemet r1=new Runnablemet();
		Thread t2=new Thread(r1);
        System.out.println("hello");
        t2.start();
	}

}
