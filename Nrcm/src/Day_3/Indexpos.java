package Day_3;

public class Indexpos {

	public static void main(String[] args) {
		int[] arr= {4,7,1,2,1,7};
		int aa1[]=new int[arr.length];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for (int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if (count==1) {
				aa1[index++]=arr[i];
			}
		}
		System.out.println("Not repeated");
		for(int i=0;i<index;i++) {
			System.out.println(aa1[i]+ " ");
		}

	}

}
