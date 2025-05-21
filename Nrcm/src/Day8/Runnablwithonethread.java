package Day8;

public class Runnablwithonethread implements Runnable{
	public void run() {
			System.out.println("hi");
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Runnablewithtwithreads rb1=new Runnablewithtwithreads();
			//Runnablewithtwithreads rb2=new Runnablewithtwithreads();
			Thread t1=new Thread(rb1);
			Thread t2=new Thread(rb1);
			System.out.println("hey");
			t1.start();
			t2.start();

		}

	}



