package Day8;
import java.util.*;
public class Cursoreg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(12);
		l1.add(25);
		l1.add(32);
		System.out.println(l1);
		Iterator il=l1.iterator();
		while(il.hasNext()) {
			System.out.println(il.next());
		}

	}

}
