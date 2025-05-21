package Day8;

public class Similar implements Runnable{
	public void run() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Similar rb1=new Similar();
		Similar rb2=new Similar();
		
		System.out.println("hey");
		rb1.run();
		rb2.run();


	}

}
