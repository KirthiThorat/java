package Day9;
import java.util.*;
public class List4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(44);
		l1.add(34);
		l1.add(57);
		System.out.println(l1);
		l1.addFirst(11);
		l1.addLast(56);
		l1.add(3,45);
		System.out.println(l1);
		l1.removeFirst();
		l1.removeLast();
		l1.removeFirstOccurrence(45);
		l1.remove(2);
		System.out.println(l1);

	}

}
