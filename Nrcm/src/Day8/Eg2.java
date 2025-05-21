package Day8;
class Eg1 extends Thread {
	public void run() {
		System.out.println("what");
	}
}
class Eg3 extends Eg1{
	public void run() {
		System.out.println("you");
		
	}
}
class Eg4 implements Runnable{
	public void run() {
		System.out.println("doing");
	}
}
class Eg5 extends Eg4{
	public void run() {
		System.out.println("girl");
	}
}	
	public class Eg2{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eg1 e1=new Eg1();
		Eg3 e2=new Eg3();
		Eg4 e3=new Eg4();
		Eg5 e4=new Eg5();
		Thread t1=new Thread(e3);
		Thread t2=new Thread(e4);
		e1.start();
		e2.start();
		t1.start();
		t2.start();
		

	}

}
