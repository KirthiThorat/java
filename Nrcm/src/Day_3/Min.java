package Day_3;

public class Min {

	public static void main(String[] args) {
		int[] arr= {4,7,1,2};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Min: "+min);

	}

}
