package Day9;
import java.util.*;

public class Ll2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1= {45,67,89,23,56};
		Arrays.sort(arr1);
		int a= Arrays.binarySearch(arr1,  56);//finding index position
		System.out.println(a);
		for(int b1:arr1) {
			System.out.println(b1);
		}
	}	
}	


