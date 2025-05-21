package Day5;
interface News{
	void language();
}
interface Channels{
	void number();
}
class Regional{
	void num() {
		System.out.println("456");
	}
}
class side extends Regional implements News,Channels{
	public void north() {
		System.out.println("up");
	}
	public void south() {
		System.out.println("telangana");
	}
	public void language() {
		System.out.println("Telugu");
	}
	public void number() {
		System.out.println("five");
	}
}

public class Assign4 {
	public static void main(String[] args) {
		Regional r1=new Regional();
		side s1=new side();
		s1.language();
		s1.number();
		s1.north();
		r1.num();
	}

}
