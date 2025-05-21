package Day9;
import java.util.*;
public class Arraytolist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> l1=new ArrayList<Object>();
		l1.add(23);
		l1.add("yo");
		l1.add(45);
		l1.add(2,"67");
		System.out.println(l1);
		List<Object> extra=Arrays.asList(6,7,8);
		l1.addAll(1,extra);
		System.out.println(l1.get(4));
		System.out.println(l1.indexOf(8));
		Object[] arr=l1.toArray();
		for(Object a1:arr) {
			System.out.println(a1);
		}
		

	}

}
 