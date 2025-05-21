package Day8;
import java.util.*;
public class Vectorr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> l1=new Vector<Integer>();
		l1.add(23);
		l1.add(44);
		l1.add(56);
		System.out.println(l1);
		Enumeration il=l1.elements();
		while(il.hasMoreElements()) {
			System.out.println(il.nextElement());
		}

	}

}
