package Day6;
class Dem{
	void show() {
		System.out.println("kirthi");
	}
}

public class Anoynamusclass {
	Dem d=new Dem() {
		void show() {
			System.out.println("thorat");
			super.show();//annoynamus class should always be taken with the object
		}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anoynamusclass ac1=new Anoynamusclass();
		ac1.d.show();

	}

}
