package Day_3;

public class Seperatevownobj {

	public static void main(String[] args) {
		String str="helloworld";
		int vowels=0;
		int consonants=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch =='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u') vowels++;
			else if(ch>='a' && ch<='z') consonants++;
		}
		System.out.println("Vowels: "+vowels+", Consonants: " +consonants+"");
				
		

	}

}
