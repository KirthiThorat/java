package Day9;
import java.util.*;
public class Conti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> l1=new ArrayList<Object>();
		l1.add(23);
		l1.add("yo");
		l1.add(45);
		l1.add(2,"sup");
		System.out.println(l1);
		List<Object> extra=Arrays.asList("kirthi","ani","nam");
		l1.addAll(1,extra);
		System.out.println(l1.get(4));
		

	}

}
