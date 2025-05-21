package Day_3;

public class Stringbufferwithappend {

	public static void main(String[] args) {
		String s1="listen";
		String s2="silent";
		StringBuffer sb1=new StringBuffer(s1);
		StringBuffer sb2=new StringBuffer(s2);
		System.out.println(sb1.append(sb2));
		//append is used to add other string to existing string without wasting memory, concat is used to add 2 strings and make new memory,concat wastes memory.

	}

}
