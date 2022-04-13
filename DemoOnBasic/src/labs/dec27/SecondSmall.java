package labs.dec27;

public class SecondSmall {
	/**
	 * Get the second smallest element in the array
	 * @param arr[]
	 */
	public static int getSecondSmallest(int[] arr) {
		int smlPoss=0;
		while((smlPoss++)<2) {
			for(int exch,i=0;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					exch=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=exch;
				}
			}
		}
		return arr[arr.length-2];
	}

	public static void main(String[] args) {
		
	int arr[]= {12,67,34,80,40,47,33,89,45};
	System.out.println("The second smallest element in the array is : "+getSecondSmallest(arr));
	}

}
