package Day5;
interface Parents{
	void eat();
}
 class Dad implements Parents{
	void kids() {
		System.out.println("brother,sistar");
	}
	void Mother() {
		System.out.println("Ashley");
	}
	@Override
	public void eat() {
		
		
	}
	
}
interface Family{
	void happy();
}
class members implements Family{
	public void enjoy() {
		System.out.println("Trips");
	}
	public void temple() {
		System.out.println("ganesh,laxmi");
	}	
	public void happy() {
		System.out.println("yes");
	}
}
interface Families{
	void sweet();
}
class Jointfamily implements Families{
	public void bigbrother() {
		System.out.println("2 kids");
	}
	public void sister() {
		System.out.println("has 1 child");
	}
	public void sweet() {
		System.out.println("Laddu");
	}
}


public class Assign8 {

	public static void main(String[] args) {
		
		Dad d5=new Dad();
		members m1=new members();
		Jointfamily j1=new Jointfamily();
		d5.eat();
		d5.kids();
		m1.enjoy();
		m1.happy();
		j1.bigbrother();
		j1.sister();
		

	}

}



