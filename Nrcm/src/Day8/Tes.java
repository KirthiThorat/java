package Day8;
public class Tes extends Thread{
	public void run() {
			for(int i=0;i<=10;i++) {
				System.out.println(i);
				if(i==5) {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}	
		}
			

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Tes e6=new Tes();
			e6.start();

		}

	}

