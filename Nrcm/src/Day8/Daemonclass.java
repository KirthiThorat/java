package Day8;

public class Daemonclass extends Thread{
	String s;
	public Daemonclass(String name) {
	s=name;
	}

    public void run() {
    	if(Thread.currentThread().isDaemon()) {
    		System.out.println(s + "is Daemon Thread");
    	}
    	else {
    		System.out.println(s + "is User Thread");
    	}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1=new Thread("thread1");
		Thread thread2=new Thread("thread2");
		Thread thread3=new Thread("thread3");
		thread1.setDaemon(true);
		thread1.start();
		thread2.start();
		thread3.setDaemon(false);
		thread3.start();

	}

}
