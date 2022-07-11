
public class RemoveDuplicates {
	
	public static void main(String args[]) {
		
		int[] arr = {1,2,3,2,5};
		int len = arr.length;
		
		int j=0; // To store unique elements
		
		for(int i=0; i<len; i++) {
			if(arr[i]!= arr[i+1]) {
				arr[j++] = arr[i];
				
				
			}
			arr[j++] = arr[len-1];
		}
		
		for(int i=0; i<len; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
