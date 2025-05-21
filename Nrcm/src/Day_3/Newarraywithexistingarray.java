package Day_3;

public class Newarraywithexistingarray {

	public static void main(String[] args) {
		int[] arr= {4,7,1,2};
		int aa1[]=new int[arr.length];//create new array with exisiting array
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Min: "+min);

	}

}
