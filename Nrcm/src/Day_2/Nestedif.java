package Day_2;

public class Nestedif {

	public static void main(String[] args) {
		int a =10;
		if(a%2==0) {
			System.out.println("multiplied with 2");
			if(a%3==0) {
				System.out.println("it multiplied with 3");
			}
			else {
				System.out.println("not multiplied with 3");
			}
				
		}

	}

}
