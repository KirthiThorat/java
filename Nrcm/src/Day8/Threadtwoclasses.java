package Day8;

public class Threadtwoclasses extends Thread{
	public void run() {
		System.out.println("mrng");
	}
}
class Test3 implements Runnable{
	public void run() {
		System.out.println("sup");
	}
}
class Test1{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadtwoclasses t4=new Threadtwoclasses();
		Test3 t1= new Test3();
		System.out.println("hello");
		t4.start();
		Thread t3=new Thread(t1);
		t3.start();
	}

}
