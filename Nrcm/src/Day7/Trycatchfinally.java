package Day7;
import java.util.*;

public class Trycatchfinally{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ce=new Scanner(System.in);
		System.out.println("enter a,b values: ");
		try {
			int a=ce.nextInt();
			int b=ce.nextInt();
			int c=a/b;
			System.out.println(c);
			
		}catch(ArithmeticException|InputMismatchException e) {//|-pipe symbol is used to handle 2 catch blocks in one
			System.out.println(e.getMessage());
		}finally {
			System.out.println("hi");
		}
	
	}

}


