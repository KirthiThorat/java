package Day6;

public class Samapl7 {
	void show() {
		System.out.println("hi");
	}
	class T8{
		void print() {
			System.out.println("heya");
		}
	}

	public static void main(String[] args) {
		Samapl7 s7=new Samapl7();
		s7.show();
		Samapl7.T8 t4=new Samapl7().new T8();//this is another method to call objects of class inside another class
		t4.print();

	}

}
