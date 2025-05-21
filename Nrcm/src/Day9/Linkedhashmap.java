package Day9;
import java.util.*;
public class Linkedhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m1=new LinkedHashMap<Integer,String>();
		m1.put(1, "cse");
		m1.put(1, "civil");
		m1.put(1, "aiml");
		m1.put(1, "ece");
		m1.put(1, "ds");
		System.out.println(m1);
		for(Map.Entry<Integer,String> i:m1.entrySet()) {
			System.out.println(i.getValue());
			System.out.println(i.getKey());
		}

	}

}
