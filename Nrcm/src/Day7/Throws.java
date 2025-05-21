package Day7;
import java.util.*;

public class Throws {

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a,b values: ");
		try {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
			
		}catch(ArithmeticException | InputMismatchException e) {//|-pipe symbol is used to handle 2 catch blocks in one
			System.out.println(e.getMessage());
		}

	}

}
