package Day5;
interface Sweetmango{
	void type();
}
class Pineapple{
	public void taste() {
		System.out.println("sweet");
	}
}
class Trees extends Pineapple implements Sweetmango{
	public void size() {
		System.out.println("medium");
	}
	public void color() {
		System.out.println("red");
	}
	public void type() {
		System.out.println("Seasonal");
	}
}
class jackfruit{
	public void quantity() {
		System.out.println("1 per branch");
	}
}
class seeds extends jackfruit{
	public void skin() {
		System.out.println("peel");
	}
}

public class Assignn6 {
	public static void main(String[] args) {
		Pineapple aa2=new Pineapple();
		Trees t1=new Trees();
		jackfruit j3=new jackfruit();
		seeds ss2=new seeds();
		aa2.taste();
		t1.type();
		t1.size();
		j3.quantity();
		ss2.skin();
	}

}


