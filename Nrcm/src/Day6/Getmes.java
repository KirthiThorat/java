package Day6;
public class Getmes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println("hi");
		try {
			int c=a/b;//error starts from here so for this follow next 
		System.out.println(c);
		}catch(Exception e) {
		System.out.println(e.getMessage());
		}
		System.out.println("hey");
	}

}


