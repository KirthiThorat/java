package Day7;

public class Tt extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tt t4=new Tt();
		Thread p1=new Thread(t4);
		p1.start();
		System.out.println("hi");
		try {
			p1.sleep(20000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("hello");
		

	}

}
