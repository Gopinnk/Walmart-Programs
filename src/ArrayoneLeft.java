import java.util.Arrays;

public class ArrayoneLeft {
	
		public static void main(String[] args) {
			int[] arr = { 6, 1, 8, 2, 3, 1, 4, 1, 1 };
		
			int len = arr.length-1;
			System.out.println("Length of the Array: " +len);
			
			for(int i = len; i>=0; i--) {
				if(arr[i] != 2) {
				arr[len] = arr[i];
				len --;
				}
			}
			for(int j=len;j>=0;j--) {
				arr[j] = 2;
			}
			System.out.println(Arrays.toString(arr));
		}
}
