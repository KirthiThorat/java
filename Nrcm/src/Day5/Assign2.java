package Day5;
interface I17{
	void butter();
}
interface Ii8 extends I17{
	void cream();
}
class clii implements Ii8{
	public void butter() {
		System.out.println("almond");
	}
	public void cream() {
		System.out.println("vanilla");
	}
	public void flour() {
		System.out.println("wheat");
	}
}
class cli implements Ii8{
	public void butter() {
		System.out.println("peanut");
	}
	public void cream() {
		System.out.println("chocolate");
	}
	public void color() {
		System.out.println("white");
	}
}	
public class Assign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clii l=new clii();
		cli l2=new cli();
		l.butter();
		l.cream();
		l.flour();
		l2.butter();
		l2.cream();
		l2.color();
	}
}	

