import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondLargestElement {
	
	public static void main(String args[]) {
		
		int arr[] = {10,20,25,45,29,30,50,76};
		int len = arr.length;
		int temp;
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Optional<Integer> result = list.stream().sorted(Comparator.reverseOrder())
				.skip(2).findFirst();
		System.out.println("USing Java 8 second higestNumber: " +result);
		
		for(int i=0; i<len; i++) {
			for(int j=i+1; j<len; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.println("Largest Element: " +arr[len-3]);
	}

	
	
}
