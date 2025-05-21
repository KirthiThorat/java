package Day9;
import java.util.*;
public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> l1=new ArrayList<Object>();
		l1.add(23);
		l1.add("yo");
		l1.add(45);
		List<Object> l2=new ArrayList<Object>(11);
		l2.add(23);
		l2.add(45);
		l2.add(45);
		l2.addAll(l1);
		l2.add(null);
		System.out.println(l2);
	


	}

}
