package Day5;
class Movies{
	void genre() {
		System.out.println("dark and crime");
	}
}
class hit extends Movies{
	void action() {
		System.out.println("Documentry");
	}
}
class Shoot extends hit {
	void name() {
		System.out.println("Akshay");
	}
}
class  hero extends hit {
	void look() {
		System.out.println("bootiful");
	}
}

public class Demo8 {

	public static void main(String[] args) {
		Shoot s1=new Shoot();
		hero h1=new hero();
		s1.action();
		s1.genre();
		s1.name();
		h1.look();
		
	}

}
