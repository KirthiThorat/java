package Day5;
interface Hindi{
	void letter();
}
interface English{
	void words();
}
interface Language extends Hindi,English{
	void telugu();
}
class Alphabets{
	void alpha() {
		System.out.println("Alphabets are: 'a','b','c','d','z'");
	}
}
class upper extends Alphabets implements Language{
	public void uppercase() {
		System.out.println("'A','B','C','Z'");
	}
	public void lowercase() {
		System.out.println("'h','i','j''y'");
	}
	public void mid() {
		System.out.println("'m','n','o'");
	}
	public void last() {
		System.out.println("'w','x','y','z'");
	}
	public void letter() {
		System.out.println("a");
	}
	public void words() {
		System.out.println("b");
	}
	public void telugu() {
		System.out.println("p");
	}
	
}

public class Assign7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		upper u1=new upper();
		Alphabets A3=new Alphabets();
		u1.letter();
		u1.words();
		u1.uppercase();
		u1.last();
		A3.alpha();
		
	}

}


