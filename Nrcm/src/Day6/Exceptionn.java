package Day6;
public class Exceptionn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
		System.out.println("hi");
		try {
			int b=Integer.parseInt(args[1]);
		int c=a/b;//error starts from here so for this follow next 
		System.out.println(c);
		}catch(Exception e) {
		System.out.println(e);
		}
		System.out.println("hey");
	}

}

