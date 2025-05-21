package Day7;

import java.util.*;




public class Conti {
	void add() throws ArithmeticException, InputMismatchException{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a,b values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a/b;
		System.out.println(c);
	}
	public static void main(String[]args) {
		Conti s1= new Conti();
		s1.add();
		
	}

}


