package Day5;
interface Games{
	void cricket();
}
class Ball{
	public void type() {
		System.out.println("Hard");
	}
}
class Football extends Ball implements Games{
	public void layer() {
		System.out.println("rough");
	}
	public void layers() {
		System.out.println("Five");
	}
	public void cricket() {
		System.out.println("Sports");
	}
}
class cost extends Football {
	public void payMode() {
		System.out.println("online");
	}
}
public class Assign3 {

	public static void main(String[] args) {
		Football f1=new Football();
		cost c1=new cost();
		f1.cricket();
		f1.type();
		f1.layer();
		c1.payMode();

	}

}


